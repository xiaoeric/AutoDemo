
package org.usfirst.frc253.AutoDemo.subsystems;

import org.usfirst.frc253.AutoDemo.RobotMap;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Drivetrain extends Subsystem {
    
	private Victor driveMotorLeft;
	private Victor driveMotorLeft_Back;
	private Victor driveMotorRight;
	private Victor driveMotorRight_Back;
	
	public Drivetrain() {
		super();
		driveMotorLeft = new Victor(RobotMap.driveMotorLeft);
		driveMotorLeft_Back = new  Victor(RobotMap.driveMotorLeft_Back);
		driveMotorRight = new Victor(RobotMap.driveMotorRight);
		driveMotorRight_Back = new Victor(RobotMap.driveMotorRight_Back);
	}
	
    public void initDefaultCommand() {
    }
    
    public void setLeft(double power) {
    	driveMotorLeft.set(power * RobotMap.driveMotorLeftDir);
    }
    
    public void setLeft_Back(double power) {
    	driveMotorLeft_Back.set(power * RobotMap.driveMotorLeftBackDir);
    }
    public void setRight(double power) {
    	driveMotorRight.set(power * RobotMap.driveMotorRightDir);
    	
    }
    public void setRight_Back(double power) {
    	driveMotorRight_Back.set(power * RobotMap.driveMotorRightBackDir);
    }
    
    public double getLeftSpeed() {
    	return driveMotorLeft.getSpeed();
    }
    public double getLeft_BackSpeed() {
    	return driveMotorLeft_Back.getSpeed();
    }
    
    public double getRightSpeed() {
    	return driveMotorRight.getSpeed();
    }
    public double getRight_BackSpeed() {
    	return driveMotorRight_Back.getSpeed();
    }

}