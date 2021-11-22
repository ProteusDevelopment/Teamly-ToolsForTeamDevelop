package com.cherdev.teamly.users;

public class User
{
    private final long id;
    private final String name;
    private final String displayName;
    private final String email;
    private final String password;

    public User(long id, String name, String displayName, String email, String password)
    {
        this.id = id;
        this.name = name;
        this.displayName = displayName;
        this.email = email;
        this.password = password;
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
