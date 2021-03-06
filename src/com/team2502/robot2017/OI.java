package com.team2502.robot2017;

import com.team2502.robot2017.command.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

@SuppressWarnings("WeakerAccess")
public final class OI
{
    public static final Joystick JOYSTICK_DRIVE_LEFT = new Joystick(RobotMap.Joystick.JOYSTICK_DRIVE_LEFT);
    public static final Joystick JOYSTICK_DRIVE_RIGHT = new Joystick(RobotMap.Joystick.JOYSTICK_DRIVE_RIGHT);
    public static final Joystick JOYSTICK_FUNCTION = new Joystick(RobotMap.Joystick.JOYSTICK_FUNCTION);
    public static final Button SWITCH_DRIVE_TRANSMISSION = new JoystickButton(JOYSTICK_DRIVE_RIGHT, RobotMap.Joystick.Button.SWITCH_DRIVE_TRANSMISSION);
    public static final Button GEAR = new JoystickButton(JOYSTICK_FUNCTION, RobotMap.Joystick.Button.GEAR);

    
    static
    {
        SWITCH_DRIVE_TRANSMISSION.whenPressed(new SwitchDriveTransmissionCommand());
        GEAR.whenPressed(new GearCommand());
//        ONLY_AGITATOR.whileHeld(new OnlyAgitatorCommand());
    }

    public static void init() {}

    private OI() {}
}
