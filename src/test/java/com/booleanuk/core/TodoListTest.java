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
        Assertions.assertEquals(false, todoList.listTasks(tasks, "Tidy up"));
        Assertions.assertEquals(false, todoList.listTasks(tasks, "Finish task"));
        Assertions.assertEquals(true, todoList.listTasks(tasks, "Lunch"));
    }


}
