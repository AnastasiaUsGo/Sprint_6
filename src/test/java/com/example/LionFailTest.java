package com.example;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class LionFailTest {
    Feline feline;

    @Test
        public void testCheckException() {
            Exception actualException = assertThrows(Exception.class, () ->
                    new Lion("something", feline));
            assertEquals("Используйте допустимые значения пола животного - самец или самка",
                    actualException.getMessage());
        }
}
