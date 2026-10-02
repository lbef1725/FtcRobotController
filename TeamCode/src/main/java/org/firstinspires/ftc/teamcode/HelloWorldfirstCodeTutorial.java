package org.firstinspires.ftc.teamcode;

import androidx.annotation.NonNull;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@Disabled
        @Autonomous
    public class HelloWorldfirstCodeTutorial extends OpMode
   {
       @Override
       public void init() {
        telemetry.addData("hello","Felix");

       }


       @Override
       public void loop() {
       }
   }
             //@teleOp for manual section of DS
             //@autonomous for autonomous section of DS
             // sonion ring