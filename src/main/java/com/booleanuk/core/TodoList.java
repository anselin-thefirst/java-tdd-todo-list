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
        String output;
        if (tasks.isEmpty()) {
            output = "Todo-list is empty";
            return output;
        }
        output = tasks.keySet().toString();
        return output;
    }

    public Boolean updateTaskStatus(HashMap<String, Boolean> tasks, String name) {
        if (tasks.get(name).equals(false)) {
            tasks.put(name, true);
            System.out.println(tasks.entrySet());
            return true;
        } else if (tasks.get(name).equals(true)) {
            tasks.put(name, false);
            System.out.println(tasks.entrySet());
            return true;
        }
        return false;
    }
}
