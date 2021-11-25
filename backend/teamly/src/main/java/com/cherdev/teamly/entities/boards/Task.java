package com.cherdev.teamly.entities.boards;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String description;
    @ManyToOne
    @JoinColumn(name = "stage_id")
    private Stage stage;
    @ManyToOne
    @JoinColumn(name = "parent_task_id")
    private Task parentTask;

    public Task()
    {
    }

    public Task(String name, String description, Stage stage, Task parentTask)
    {
        this.name = name;
        this.description = description;
        this.stage = stage;
        this.parentTask = parentTask;
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

    @JsonIgnore
    public Stage getStage()
    {
        return stage;
    }

    public Task getParentTask()
    {
        return parentTask;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setStage(Stage stage)
    {
        this.stage = stage;
    }

    public void setParentTask(Task parentTask)
    {
        this.parentTask = parentTask;
    }
}
