package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.Servo;

@Autonomous(name="Autonomous-Red", group="Linear Opmode")
public class AutonomousRed extends Movement
{
    protected final Double SERVO_INITIAL_POS = 0.4;

    public void runOpModeImpl() {
        backServo.setPosition(SERVO_INITIAL_POS);

        waitForStart();

        // Move Backward
        goBackward(0.5, 1700, "Going back");
        stop("Pausing");

        //Servo down

        backServo.setPosition(1);
        sleep(900);

        //Move forward at angle towards the right

        leftfront.setPower(0.3);
        leftback.setPower(0.3);
        rightfront.setPower(0.35);
        rightback.setPower(0.35);
        sleep(2950);

        updateTelemetryMessage("Going forward at angle towards right");
        stop("Stopping");

        // Servo up
        backServo.setPosition(SERVO_INITIAL_POS);
        sleep(500);

        //Move left

        goLeft(0.8,2150, "Going left");
        stop("Stopping");


    }

}