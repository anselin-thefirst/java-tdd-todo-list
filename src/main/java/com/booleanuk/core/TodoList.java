package com.booleanuk.core;

import java.util.HashMap;
// import java.util.Map;

public class TodoList {
    private HashMap<String, Boolean> tasks;

    public TodoList(HashMap<String, Boolean> tasks) {
        this.tasks = new HashMap<>(tasks);
    }

    public Boolean add(String name) {
        Boolean status = false;
        if (!tasks.containsKey(name)) {
            tasks.put(name, status);
            return true;
        }
        return false;
    }

    public String listTasks() {
        String output;
        if (tasks.isEmpty()) {
            output = "Todo-list is empty";
            return output;
        }
        output = tasks.keySet().toString();
        return output;
    }

    public Boolean updateTaskStatus(String name) {
        if (!tasks.containsKey(name)) {
            return false;
        }
        if (tasks.get(name).equals(false)) {
            tasks.put(name, true);
            return true;
        } else if (tasks.get(name).equals(true)) {
            tasks.put(name, false);
            return true;
        }
        return false;
    }

    /*public String listCompletedTasks(HashMap<String, Boolean> tasks) {
        HashMap<String, Boolean> completedTasks;
        for (Map.Entry<String, Boolean> task : tasks.entrySet()) {
            if (task.getKey().equals(true)) {
                completedTasks.put(task.getKey(), true);
            }
        }
    }*/
}
