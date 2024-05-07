import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class LightControllerTest{
    LightController light;
    @BeforeEach
    void setUp(){
        light = new LightController();
    }
    @Test
    void getlight1(){
        assertEquals(0,light.getLampState());
    }
    @Test
    void getlight2(){
        light.toggleFirstSwitch();
        assertEquals(1,light.getLampState());
    }
    void getlight3(){
        light.toggleSecondSwitch();
        assertEquals(1,light.getLampState());
    }

    void getlight4(){
        light.toggleFirstSwitch();
        light.toggleSecondSwitch();
        assertEquals(0,light.getLampState());
    }
    @Test
    void toggleFirstSwitch() {
    }
    @Test
    void toggleSecondSwitch() {
    }
    @Test
    void getFirstSwitchState() {
    }
    @Test
    void getSecondSwitchState() {
    }
    @Test
    void getLampState() {
    }
}





