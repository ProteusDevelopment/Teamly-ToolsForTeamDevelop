package com.cherdev.teamly.controllers.boards;

import com.cherdev.teamly.entities.boards.Board;
import com.cherdev.teamly.entities.boards.Stage;
import com.cherdev.teamly.properties.mappings.BoardsMappings;
import com.cherdev.teamly.repositories.board.BoardRepository;
import com.cherdev.teamly.repositories.board.StageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(BoardsMappings.STAGES)
public class StageController
{
    @Autowired private BoardRepository boardRepository;
    @Autowired private StageRepository stageRepository;

    @GetMapping
    public List<Stage> allStages()
    {
        return stageRepository.findAll();
    }

    @GetMapping(BoardsMappings.BY_ID_KEY)
    public Stage stage(@PathVariable long id)
    {
        return stageRepository.findById(id).orElse(null);
    }

    @PostMapping(BoardsMappings.NEW)
    public ResponseEntity<String> newStage(@RequestParam String name,
                                           @RequestParam(required = false, defaultValue = "") String description,
                                           @RequestParam(name = "board_id") long boardId)
    {
        Board board = boardRepository.findById(boardId).orElse(null);

        if (board != null)
        {
            Stage newStage = new Stage(name, description, board);

            stageRepository.saveAndFlush(newStage);

            return new ResponseEntity<>("Success", HttpStatus.OK);
        }
        else
        {
            return new ResponseEntity<>("Board doesn't exists", HttpStatus.BAD_REQUEST);
        }
    }
}
