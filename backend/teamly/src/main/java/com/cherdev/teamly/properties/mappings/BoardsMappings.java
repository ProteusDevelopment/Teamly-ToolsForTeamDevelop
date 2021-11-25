package com.cherdev.teamly.properties.mappings;

import com.cherdev.teamly.properties.mappings.Mappings;

public class BoardsMappings
{
    public static final String BOARDS = Mappings.API + "/boards";

    public static final String STAGES = BOARDS + "/stages";
    public static final String TASKS = BOARDS + "/tasks";

    public static final String BY_ID_KEY = "/{id}";
    public static final String NEW = "/new";
}
