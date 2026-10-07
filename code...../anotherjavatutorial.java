package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.OpMode;
import com.qualcomm.robotcore.teleOp;

@teleop 

public class anotherjavatutorial extends OpMode {

@Override 
public void init() {

//datatypes 
/*integer "int" is used to integer new 
 variables exemple under */
 int x;
 //"x" is the new variable here

 /*booleans are true or false information, it
 can eather be true or false. exemple under...*/
boolean clawopened = false;

/*double type variables are used to store long
numbers or decimal numbers, */
double motorspeed = 0.75;

telemetry.addData("team number", teamnumber);
telemetry.addData("motorspeed", motorspeed);
telemetry.addData("clawopened", clawopened);
}


@Override 
public void loop() {
    
    }

}
