package com.cherdev.teamly.board;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/board")
public class BoardController
{
    private static List<Task> tasks = Arrays.asList(
            new Task(0, "Initialize", "Made initialize version."),
            new Task(1, "Vue integrity", "Integrates vue framework."),
            new Task(2, "Docker integrity", "This task creates for very long description."),
            new Task(3, "Build", "Build release version.")
    );

    private static List<Stage> stages = Arrays.asList(
            new Stage(0, "Develop", Arrays.asList(tasks.get(0), tasks.get(1), tasks.get(2))),
            new Stage(1, "Release", Arrays.asList(tasks.get(3)))
    );

    private static List<Board> boards = Arrays.asList(
            new Board(0, "Teamly task board", "A convenient task board will allow your team to deal" +
                    "exclusively with tasks, and we will take care of their organization!",
                    Arrays.asList(stages.get(0), stages.get(1)))
    );

    @GetMapping
    public Board board(@RequestParam(defaultValue = "0") long id)
    {
        return boards.get((int) id);
    }

    @GetMapping("/stage")
    public Stage stage(@RequestParam(defaultValue = "0") long id)
    {
        return stages.get((int) id);
    }

    @GetMapping("/task")
    public Task task(@RequestParam(defaultValue = "0") long id)
    {
        return tasks.get((int) id);
    }
}
