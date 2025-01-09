package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class TodoListTest {

    @Test
    public void testAddNewTaskToList() {
        TodoList todoList = new TodoList();
        HashMap<String, Boolean> tasks = new HashMap<>() {{
            put("Tidy up", false);
            put("Finish task", false);
            put("Lunch", true);
        }};
        Assertions.assertTrue(todoList.add(tasks, "Sleep"));
    }

    @Test
    public void testAddOldTaskToList() {
        TodoList todoList = new TodoList();
        HashMap<String, Boolean> tasks = new HashMap<>() {{
            put("Tidy up", false);
            put("Finish task", false);
            put("Lunch", true);
        }};
        Assertions.assertFalse(todoList.add(tasks, "Lunch"));
    }

    @Test
    public void testListAllTasks() {
        TodoList todoList = new TodoList();
        HashMap<String, Boolean> tasks = new HashMap<>() {{
            put("Tidy up", false);
            put("Finish task", false);
            put("Lunch", true);
        }};
        Assertions.assertEquals("[Tidy up, Finish task, Lunch]", todoList.listTasks(tasks));
    }

    @Test
    public void testListNoTask() {
        TodoList todoList = new TodoList();
        HashMap<String, Boolean> tasks = new HashMap<>();
        Assertions.assertEquals("Todo-list is empty", todoList.listTasks(tasks));
    }
}
