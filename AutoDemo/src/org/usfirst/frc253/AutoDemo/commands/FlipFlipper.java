package org.usfirst.frc253.AutoDemo.commands;

import org.usfirst.frc253.AutoDemo.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class FlipFlipper extends Command {

    public FlipFlipper() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.gearFlip);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(1.5);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.gearFlip.DeployGear();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.gearFlip.FullStop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
