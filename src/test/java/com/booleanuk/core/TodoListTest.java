package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class TodoListTest {

    private TodoList todoList;

    @BeforeEach
    public void setUp() {
        HashMap<String, Boolean> tasks = new HashMap<>() {{
            put("Tidy up", false);
            put("Lunch", true);
        }};
        todoList = new TodoList(tasks);
    }

    @Test
    public void testAddNewTaskToList() {
        Assertions.assertTrue(todoList.add("Sleep"));
    }

    @Test
    public void testAddOldTaskToList() {
        Assertions.assertFalse(todoList.add("Lunch"));
    }

    @Test
    public void testListAllTasks() {
        Assertions.assertEquals("[Tidy up, Lunch]", todoList.listTasks());
    }

    @Test
    public void testListNoTask() {
        HashMap<String, Boolean> noTasks = new HashMap<>();
        TodoList todoList = new TodoList(noTasks);
        Assertions.assertEquals("Todo-list is empty", todoList.listTasks());
    }

    @Test
    public void testUpdateTaskStatus() {
        Assertions.assertTrue(todoList.updateTaskStatus("Tidy up"));
        Assertions.assertTrue(todoList.updateTaskStatus("Lunch"));
    }

    @Test
    public void testListCompletedTasks() {
        Assertions.assertEquals("Lunch, ", todoList.listCompletedTasks());
    }

}
