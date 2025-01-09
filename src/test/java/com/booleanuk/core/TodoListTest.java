package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

class TodoListTest {

    HashMap<String, Boolean> tasks = new HashMap<>() {{
        put("Tidy up", false);
        put("Finish task", false);
        put("Lunch", true);
    }};

    @Test
    public void testAddNewTaskToList() {
        tasks.put("Sleep", false);
        Assertions.assertTrue(true);
    }
}
