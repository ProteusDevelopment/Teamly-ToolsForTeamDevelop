package com.cherdev.teamly.entities.users;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String displayName;
    private String email;
    private String password;

    public User()
    {
    }

    public User(String name, String displayName, String email, String password)
    {
        this.name = name;
        this.displayName = displayName;
        this.email = email;
        this.password = password;
    }

    public User(long id, String name, String displayName, String email, String password)
    {
        this(name, displayName, email, password);

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

    public String getDisplayName()
    {
        return displayName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setId(long id)
    {
        this.id = id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setDisplayName(String displayName)
    {
        this.displayName = displayName;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }
}
