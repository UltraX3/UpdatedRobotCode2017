package com.team2502.robot2017.command.autonomous;

import com.team2502.robot2017.Robot;
import com.team2502.robot2017.subsystem.GearBoxSubsystem;
import edu.wpi.first.wpilibj.command.Command;

public class PushGearCommand extends Command
{
    private final GearBoxSubsystem gearBox;
    private final boolean on;

    public PushGearCommand(boolean on)
    {
        requires(Robot.GEAR_BOX);
        gearBox = Robot.GEAR_BOX;
        this.on = on;
    }

    @Override
    protected void initialize()
    {

    }

    @Override
    protected void execute()
    {
     gearBox.setGear(on);
    }

    @Override
    protected boolean isFinished()
    {
        return true;
    }

    @Override
    protected void end()
    {

    }

    @Override
    protected void interrupted()
    {

    }
}