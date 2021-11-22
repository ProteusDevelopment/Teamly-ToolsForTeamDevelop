package com.cherdev.teamly.board;

import java.util.List;

public class Board
{
    private final long id;
    private final String name;
    private final String description;
    private final List<Stage> stages;

    public Board(long id, String name, String description, List<Stage> stages)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.stages = stages;
    }

    public long getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public String getDescription()
    {
        return description;
    }

    public List<Stage> getStages()
    {
        return stages;
    }
}
