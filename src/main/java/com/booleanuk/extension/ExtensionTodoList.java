package com.booleanuk.extension;

import java.util.ArrayList;

public class ExtensionTodoList {

    private ArrayList<Task> tasks;

    public ExtensionTodoList(ArrayList<Task> tasks) {
        this.tasks = new ArrayList<>(tasks);
    }

    public String getTaskById(int id) {
        String output = "";
        String status = "";
        for (Task task : this.tasks) {
            if (task.getId() == id) {
                if (task.isStatus()) {
                    status = "completed";
                }
                output = task.getName() + ", " + status;
                return output;
            }
        }
        return output;
    }
}
