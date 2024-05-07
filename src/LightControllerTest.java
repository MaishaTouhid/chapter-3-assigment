import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class LightControllerTest{
    LightController light1,light2,light3;
    @BeforeEach
    void setUp(){
        light1 = new LightController (1,1);
        light2 = new LightController (1,0);
    }
    @Test
    void getlight1(){
        light1.toggleFirstSwitch();
        light1.toggleSecondSwitch();
        assertEquals(0,light1.getLampState());

    }
    @Test
    void getlight2(){
        light2.toggleFirstSwitch();
        light2.toggleSecondSwitch();
        assertEquals(0,light2.getLampState());

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





