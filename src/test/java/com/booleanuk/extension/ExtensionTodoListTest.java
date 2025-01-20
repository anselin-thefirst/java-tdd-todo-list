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
        Assertions.assertEquals("Sleep, completed", todoList.getTaskById(2));
    }
}
