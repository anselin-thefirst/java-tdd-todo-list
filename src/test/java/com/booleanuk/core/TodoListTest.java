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
}
