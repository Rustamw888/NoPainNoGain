import org.junit.jupiter.api.Test;

import static org.example.Main.conversionMethod;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MethodTests {

    @Test
    void unitTest() {
        int a = 100;
        int b = 50;
        assertEquals(conversionMethod(a, b),"25.0");

        a = 50;
        b = 100;
        assertEquals(conversionMethod(a, b),"2.0");

        a = 0;
        b = 50;
        assertEquals(conversionMethod(a, b),"Ошибка при делении на ноль");

        a = 50;
        b = 0;
        assertEquals(conversionMethod(a, b),"25.0");
    }
}
