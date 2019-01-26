/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import com.revrobotics.CANDigitalInput;
import com.revrobotics.CANSparkMax;
import com.revrobotics.CANDigitalInput.LimitSwitchPolarity;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
  // For example to map the left and right motors, you could define the
  // following variables to use with your drivetrain subsystem.
  // public static int leftMotor = 1;
  // public static int rightMotor = 2;

  // If you are using multiple modules, make sure to define both the port
  // number and the module. For example you with a rangefinder:
  // public static int rangefinderPort = 1;
  // public static int rangefinderModule = 1;
  public static int driverPort = 0;
  public static int rightMasterID = 1;
  public static int rightMidSlaveID = 2;
  public static int rightBackSlaveID = 3;
  public static int leftMasterID = 4;
  public static int leftMidSlaveID = 5;
  public static int leftBackSlaveID = 6;

  public static CANSparkMax rightMaster = new CANSparkMax(RobotMap.rightMasterID, MotorType.kBrushless);
  public static CANSparkMax rightMidSlave = new CANSparkMax(RobotMap.rightMidSlaveID, MotorType.kBrushless);
  public static CANSparkMax rightBackSlave = new CANSparkMax(RobotMap.rightBackSlaveID, MotorType.kBrushless);
  public static CANSparkMax leftMaster = new CANSparkMax(RobotMap.leftMasterID, MotorType.kBrushless);
  public static CANSparkMax leftMidSlave = new CANSparkMax(RobotMap.leftMidSlaveID, MotorType.kBrushless);
  public static CANSparkMax leftBackSlave = new CANSparkMax(RobotMap.leftBackSlaveID, MotorType.kBrushless);

  public static CANDigitalInput limitSwitch = rightMaster.getForwardLimitSwitch(LimitSwitchPolarity.kNormallyOpen);
  }