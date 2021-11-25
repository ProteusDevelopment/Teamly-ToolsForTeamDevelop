package com.cherdev.teamly.entities.boards;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "stages")
public class Stage
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    @OneToMany(mappedBy = "stage")
    private List<Task> tasks;
    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;

    public Stage()
    {

    }

    public Stage(String name, String description, Board board)
    {
        this.name = name;
        this.description = description;
        this.board = board;
    }

    public Stage(long id, String name, String description, Board board)
    {
        this(name, description, board);

        this.id = id;
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

    @JsonIgnore
    public Board getBoard()
    {
        return board;
    }
}
