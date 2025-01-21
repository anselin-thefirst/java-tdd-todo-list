package com.booleanuk.extension;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class ExtensionTodoListTest {
    private ExtensionTodoList todoList;

    @BeforeEach
    public void setUp() {
        ArrayList<Task> tasks = new ArrayList<>() {{
            add(new Task("Eat", false));
            add(new Task("Sleep", true));
        }};
        todoList = new ExtensionTodoList(tasks);
    }

    @Test
    public void testGetTaskById() {
        Assertions.assertEquals("Eat, incomplete", todoList.getTaskById(0));
        Assertions.assertEquals("Sleep, completed", todoList.getTaskById(1));
    }

    @Test
    public void testUpdateTaskName() {
        Assertions.assertEquals("Task successfully updated to: Dinner", todoList.updateTaskName(0, "Dinner"));
        Assertions.assertEquals("Task successfully updated to: sleep", todoList.updateTaskName(1, "sleep"));
    }
}
