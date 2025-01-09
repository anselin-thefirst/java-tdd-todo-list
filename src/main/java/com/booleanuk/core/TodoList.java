package com.booleanuk.core;

import java.util.HashMap;

public class TodoList {

    public Boolean add(HashMap<String, Boolean> tasks, String name) {
        Boolean status = false;
        if (!tasks.containsKey(name)) {
            tasks.put(name, status);
            return true;
        }
        return false;
    }

    public String listTasks(HashMap<String, Boolean> tasks) {
        return tasks.keySet().toString();
    }
}
