package org.usfirst.frc253.AutoDemo.commands;

import org.usfirst.frc253.AutoDemo.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveBackward extends Command {

    public DriveBackward() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.driveTrain);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(1.0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveTrain.setLeft_Back(-.5);
    	Robot.driveTrain.setLeft(-.5);
    	Robot.driveTrain.setRight(-.5);
    	Robot.driveTrain.setRight_Back(-.5);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
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
