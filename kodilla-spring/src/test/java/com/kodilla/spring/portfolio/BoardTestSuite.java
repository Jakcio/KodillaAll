package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {

        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToDoList().getTasksList().add("Task 1");
        board.getInProgressList().getTasksList().add("Task 2");
        board.getDoneList().getTasksList().add("Task 3");
        //Then
        assertEquals("Task 1", board.getToDoList().getTasksList().get(0));
        assertEquals("Task 2", board.getInProgressList().getTasksList().get(0));
        assertEquals("Task 3", board.getDoneList().getTasksList().get(0));


    }

}
