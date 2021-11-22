package com.cherdev.teamly.board;

import java.util.List;

public class Stage
{
    private final long id;
    private final String name;
    private final List<Task> tasks;

    public Stage(long id, String name, List<Task> tasks)
    {
        this.id = id;
        this.name = name;
        this.tasks = tasks;
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public List<Task> getTasks()
    {
        return tasks;
    }
}
