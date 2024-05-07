public class LightController {
    private int firstSwitchState;
    private int secondSwitchState;
    private int lampState;

    public LightController() {
        firstSwitchState = 0;
        secondSwitchState = 0;
        lampState = 0;
    }

    public LightController(int firstSwitchState, int secondSwitchState) {
        this.firstSwitchState = firstSwitchState;
        this.secondSwitchState = secondSwitchState;
        this.lampState = lampState;
       // toggleLamp();
    }

    public  void toggleFirstSwitch() {
        firstSwitchState = 1 - firstSwitchState;
        toggleLamp();
    }

    public void toggleSecondSwitch() {
        secondSwitchState = 1 - secondSwitchState;
        toggleLamp();
    }

    private void toggleLamp() {
        if (firstSwitchState == 1 || secondSwitchState == 1) {
            lampState = 1 - lampState;
        }
    }
    public int getFirstSwitchState() {
        return firstSwitchState;
    }

    public int getSecondSwitchState() {
        return secondSwitchState;
    }

    public int getLampState() {
        return lampState;
    }

}
