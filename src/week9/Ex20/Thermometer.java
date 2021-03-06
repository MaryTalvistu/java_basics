package week9.Ex20;

import java.util.Random;

public class Thermometer implements Sensor {

    private final Random random;
    private Boolean status;

    public Thermometer() {
        this.random = new Random();
        this.status = false;
    }

    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void on() {
        this.status = true;
    }

    @Override
    public void off() {
        this.status = false;
    }

    @Override
    public int measure() {

        if (!this.isOn()) {
            throw new IllegalStateException("Thermometer is turned off.");
        } else {
            int randomNum = random.nextInt(30 - (-30) + 1) - 30;
            return randomNum;
        }
    }

}