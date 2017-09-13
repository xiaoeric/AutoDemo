// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc253.AutoDemo.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutonomousCommand extends CommandGroup {

    public AutonomousCommand() {

        // Add Commands here:
        // e.g. addSequential(new Command1());
        //      addSequential(new Command2());
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

    	//Available commands:
    	//DriveBackward(): drives the robot backward
    	//DriveForward(): drives the robot forward
    	//FlipFlipper(): flips the flipper
    	//RetractFlipper(): retracts the flipper
    	//RotateLeft(): robot rotates to the left; only robot orientation changes
    	//RotateRight(): robot rotates to the right; only robot orientation changes
    	//Spin120Clockwise(): robot spins 120 degrees clockwise; only robot orientation changes
    	//Spin120Counterwise(): robot spins 120 degrees counterclockwise; only robot orientation changes
    	//Spin90Clockwise(): robot spins 90 degrees clockwise; only robot orientation changes
    	//Spin90Counterwise(): robot spins 90 degrees counterclockwise; only robot orientation changes
    	//TurnLeft(): robot turns to the left; both robot orientation and position change
    	//TurnRight(): robot turns to the right; both robot orientation and position change
    	
    	//Timed commands:
    	//DriveForward(), DriveBackward(), RotateLeft(), RotateRight(), TurnLeft(), TurnRight()
    	//These commands must be provided with an amount of time to run (in seconds).
    	//e.g. addSequential(new DriveForward(1.0));
    	//This command drives the robot forward for 1.0 seconds.
    	
    	
    	
 
    } 
}