package org.example;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

public class FooTest {

    @Test
    public void testIsBuyerWinner1(){
        List<String> codeList = new ArrayList<String>();
        List<String> shoppingCart1 = new ArrayList<String>(Arrays.asList("apple", "apple", "banana", "banana", "orange", "banana"));

        assertEquals(1, Foo.IsBuyerWinner(codeList, shoppingCart1));
    }

    @Test
    public void testIsBuyerWinner2(){
        List<String> codeList = new ArrayList<String>(Arrays.asList("apple apple", "banana anything banana"));
        List<String> shoppingCart1 = new ArrayList<String>(Arrays.asList("apple", "banana", "apple", "banana", "orange", "banana"));

        assertEquals(0, Foo.IsBuyerWinner(codeList, shoppingCart1));
    }

    @Test
    public void testIsBuyerWinner3(){
        List<String> codeList = new ArrayList<String>(Arrays.asList("apple apple", "apple apple banana"));
        List<String> shoppingCart1 = new ArrayList<String>(Arrays.asList("apple", "apple", "apple", "banana"));

        assertEquals(0, Foo.IsBuyerWinner(codeList, shoppingCart1));
    }

    @Test
    public void testIsBuyerWinner4(){
        List<String> codeList = new ArrayList<String>(Arrays.asList("apple apple", "banana anything banana"));
        List<String> shoppingCart1 = new ArrayList<String>(Arrays.asList("orange", "apple", "apple", "banana", "orange", "banana"));

        assertEquals(1, Foo.IsBuyerWinner(codeList, shoppingCart1));
    }

    @Test
    public void testIsBuyerWinner5(){
        List<String> codeList = new ArrayList<String>(Arrays.asList("apple apple", "banana anything banana"));
        List<String> shoppingCart1 = new ArrayList<String>(Arrays.asList("orange", "apple", "apple","avocado", "banana", "orange", "banana"));

        assertEquals(1, Foo.IsBuyerWinner(codeList, shoppingCart1));
    }
}
