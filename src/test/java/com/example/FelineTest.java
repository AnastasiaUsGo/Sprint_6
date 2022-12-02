package com.example;

import org.junit.Assert;
import org.junit.Test;
import java.util.List;

public class FelineTest {

    @Test
    public void testEatMeat() throws Exception {
        Feline feline = new Feline();

        Assert.assertEquals((List.of("Животные", "Птицы", "Рыба")),feline.eatMeat());
    }

    @Test
    public void testGetFamily() {
        Feline feline = new Feline();

        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittens() {
        Feline feline = new Feline();

        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void testGetKittensCount() {
        Feline feline = new Feline();

        Assert.assertEquals(10, feline.getKittens(10));
    }
}