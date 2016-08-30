package com.ddoyle.android.aca.marsrobot;

/**
 * Created by deldoyle on 8/25/16.
 */
public class MarsRobot {
    String status;
    int speed;
    float temperature;
    float fuel;
    float battery;

    void checkTemperature() {
        if (temperature < -80) {
            status = "returning home";
            speed = 5;
        }
    }

    void showAttributes() {
        System.out.println("Status: " + status);
        System.out.println("Speed: " + speed);
        System.out.println("Temperature: " + temperature);

    }


    }

}
