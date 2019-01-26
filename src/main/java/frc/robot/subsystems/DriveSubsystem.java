/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.revrobotics.CANDigitalInput;
import com.revrobotics.CANEncoder;
import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class DriveSubsystem extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  CANSparkMax rightMaster1 = RobotMap.rightMaster;
  CANSparkMax leftMaster1 = RobotMap.leftMaster;
  CANSparkMax rightMidSlave1 = RobotMap.rightMidSlave;
  CANSparkMax leftMidSlave1 = RobotMap.leftMidSlave;
  CANSparkMax rightBackSlave1 = RobotMap.rightBackSlave;
  CANSparkMax leftBackSlave1 = RobotMap.leftBackSlave;
  CANDigitalInput limitSwitch1 = RobotMap.limitSwitch;
  CANEncoder encoder = rightBackSlave1.getEncoder();

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());

    rightMidSlave1.follow(rightMaster1);
    rightBackSlave1.follow(rightMaster1);
    leftMidSlave1.follow(leftMaster1);
    leftBackSlave1.follow(leftMaster1);

  }

  public void teleopDrive(double speed, double turn){
    double leftSpeed = speed + turn;
    double rightSpeed = -speed + turn;


    leftMaster1.set(leftSpeed);
    rightMaster1.set(rightSpeed);

     if(limitSwitch1.get() == false){
      System.out.println("Button is false");
    }
    if(limitSwitch1.get() == true){
       System.out.println("Button is true");
    } 
    System.out.println("Encoder: " + encoder.getPosition());
  }

}
