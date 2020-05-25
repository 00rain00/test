package test;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ControllerTest {
    @Test
    void testDisplay(){
        int id = 1;
        String r = Controller.display(id);
        assertEquals("11", r);
    }
}