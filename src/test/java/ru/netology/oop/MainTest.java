package ru.netology.oop;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    void shouldPepel(){
        FormDate formDate = new FormDate();
        Post post = new Post();
        post.name = "Petr";
        int[] expected = {31,3,2022};
        int[] actual = post.getBirthday(31,3,2022);
        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    void noShouldPepel(){
        Post post = new Post();
        int[] expected = {0,-1,-1};
        int[] actual = post.getBirthday(32,33,3333);
        Assertions.assertArrayEquals(expected,actual);
    }
}
