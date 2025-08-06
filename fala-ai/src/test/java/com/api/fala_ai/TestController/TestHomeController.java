package com.api.fala_ai.TestController;

import com.api.fala_ai.controller.HomeController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestHomeController {

    @Test
    void should_pass_when_functions_return_is_valid(){

        HomeController home = new HomeController();

        String expectedResult = "Hello, World!";
        String result = home.sayHello();

        Assertions.assertEquals(expectedResult, result);
    }

}
