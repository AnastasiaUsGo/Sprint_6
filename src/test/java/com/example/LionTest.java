package com.example;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import java.util.List;
import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class LionTest {

    @Parameterized.Parameter()
    public String male;
    @Parameterized.Parameter(1)
    public boolean expectedHasMane;

    @Mock
    Feline feline;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Parameterized.Parameters(name = "Sex of lion: {0}, expected mane: {1}")
    public static Object[][] params() {
        return new Object[][]{
                { "Самец", true },
                { "Самка", false },
        };
    }

    @Test
    public void testGetKittens() throws Exception {
            Lion lion = new Lion(male, feline);
            Mockito.when(feline.getKittens()).thenReturn(2);
            assertEquals(2, lion.getKittens());
    }

    @Test
    public void testDoesHaveMane() throws Exception {
            Lion lion = new Lion(male, feline);
            assertEquals(expectedHasMane, lion.doesHaveMane());
    }

    @Test
    public void testGetFood() throws Exception {
            Lion lion = new Lion(male, feline);
            Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
            assertEquals((List.of("Животные", "Птицы", "Рыба")), lion.getFood());
    }
}