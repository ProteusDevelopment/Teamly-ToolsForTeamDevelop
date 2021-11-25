package com.cherdev.teamly.entities.boards;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "boards")
public class Board
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "board")
    private List<Stage> stages;

    public Board()
    {

    }

    public Board(String name, String description)
    {
        this.name = name;
        this.description = description;
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
