package org.usfirst.frc253.AutoDemo.commands;

import org.usfirst.frc253.AutoDemo.Robot;

import edu.wpi.first.wpilibj.AnalogGyro;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 *
 */
public class Spin90Clockwise extends Command {

	private AnalogGyro gyro;
	
    public Spin90Clockwise(){
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    	requires(Robot.sensorData);
    	gyro = Robot.sensorData.gyro;
    	setTimeout(1.0);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	gyro.reset();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	double gyroAngle = gyro.getAngle();
    	SmartDashboard.putNumber("Gyroscope Angle", gyroAngle);
    	if(gyroAngle < 50){
    		Robot.driveTrain.setLeft_Back(-.5);
    		Robot.driveTrain.setLeft(-.5);
    		Robot.driveTrain.setRight(.5);
    		Robot.driveTrain.setRight_Back(.5);
    	} else {
    		end();
    	}
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    	//return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.driveTrain.setLeft_Back(0);
    	Robot.driveTrain.setLeft(0);
    	Robot.driveTrain.setRight(0);
    	Robot.driveTrain.setRight_Back(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
