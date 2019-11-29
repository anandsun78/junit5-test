package io.anandprojects;

/*
This was simple project created by me to learn Junit 5 in Java
by testing simple math operations
*/

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import static org.junit.jupiter.api.Assumptions.*;
import static org.junit.jupiter.api.Assertions.*;

public class MathOperationsTest {

    MathOperations mathOperations;

    @BeforeAll
     static void beforeAll()
    {
        System.out.println("before all do this");
    }

    @BeforeEach
    void Initialize()
    {
       mathOperations =   new MathOperations();
    }

    @RepeatedTest(3)
    @Tag("Hello")
    @DisplayName("Test method main")
    void Test(RepetitionInfo repetitionInfo)
    {
        repetitionInfo.getCurrentRepetition();

        if (repetitionInfo.getCurrentRepetition() ==1)
        System.out.println("First test");


    }

    @Test
    @Tag("Hello")
    @EnabledOnOs(OS.MAC)
    void TestDivide()
    {

       assertThrows(ArithmeticException.class, () -> mathOperations.divide(1,0));

    }
}
