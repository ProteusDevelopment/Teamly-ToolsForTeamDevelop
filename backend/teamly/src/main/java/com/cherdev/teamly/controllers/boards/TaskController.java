package com.cherdev.teamly.controllers.boards;

import com.cherdev.teamly.entities.boards.Stage;
import com.cherdev.teamly.entities.boards.Task;
import com.cherdev.teamly.properties.mappings.BoardsMappings;
import com.cherdev.teamly.repositories.board.StageRepository;
import com.cherdev.teamly.repositories.board.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.Nullable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(BoardsMappings.TASKS)
public class TaskController
{
    @Autowired private StageRepository stageRepository;
    @Autowired private TaskRepository taskRepository;

    @GetMapping
    public List<Task> allTasks()
    {
        return taskRepository.findAll();
    }

    @GetMapping(BoardsMappings.BY_ID_KEY)
    public Task task(@PathVariable long id)
    {
        return taskRepository.findById(id).orElse(null);
    }

    @PostMapping(BoardsMappings.NEW)
    public ResponseEntity<String> newTask(@RequestParam String name,
                                          @RequestParam(required = false, defaultValue = "") String description,
                                          @RequestParam(name = "stage_id") long stageId,
                                          @RequestParam(name = "parent_task_id", required = false) Long parentTaskId)
    {
        Stage stage = stageRepository.findById(stageId).orElse(null);

        if (stage != null)
        {
            Task newTask = new Task(name, description, stage, parentTaskId != null
                    ? taskRepository.findById(parentTaskId).get()
                    : null);

            taskRepository.saveAndFlush(newTask);

            return new ResponseEntity<>("Success", HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>("Stage doesn't exists", HttpStatus.BAD_REQUEST);
        }
    }
}
