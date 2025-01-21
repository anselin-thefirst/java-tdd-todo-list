package com.booleanuk.extension;

import java.util.ArrayList;

public class ExtensionTodoList {

    private ArrayList<Task> tasks;

    public ExtensionTodoList(ArrayList<Task> tasks) {
        this.tasks = new ArrayList<>(tasks);
    }

    public String getTaskById(int id) {
        String output;
        Task task = this.tasks.get(id);
        if (task.isStatus()) {
            output = task.getName() + ", completed";
            return output;
        }
        output = task.getName() + ", incomplete";
        return output;
    }

    public String updateTaskName(int id, String name) {
        Task task = this.tasks.get(id);
        task.setName(name);
        return "Task successfully updated to: " + task.getName();
    }
}
