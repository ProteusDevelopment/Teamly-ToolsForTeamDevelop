package com.cherdev.teamly.entities.users;

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
}
