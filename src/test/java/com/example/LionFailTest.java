package com.example;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

@RunWith(Parameterized.class)
public class LionFailTest {

    @Parameterized.Parameter()
    public String gender;
    @Parameterized.Parameter(1)
    public boolean expectedHasMane;

    Feline feline;

    @Parameterized.Parameters(name = "Sex of lion: {0}, expected mane: {1}")
    public static Object[][] params() {
        return new Object[][]{
                {"Оно", false},
                {"Что-то", false},
        };
    }

    @Test
        public void testCheckException() {
            Exception actualException = assertThrows(Exception.class, () ->
                    new Lion(gender, feline));
            assertEquals("Используйте допустимые значения пола животного - самец или самка",
                    actualException.getMessage());
        }
}
