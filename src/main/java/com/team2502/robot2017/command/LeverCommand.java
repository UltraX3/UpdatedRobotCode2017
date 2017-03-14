package com.team2502.robot2017.command;

import com.team2502.robot2017.Robot;
import com.team2502.robot2017.subsystem.GearBoxSubsystem;
import edu.wpi.first.wpilibj.command.Command;

public class LeverCommand extends Command
{
    private final GearBoxSubsystem GearBox;
    private final boolean on;

    public LeverCommand(boolean on)
    {
        requires(Robot.GEAR_BOX);
        GearBox = Robot.GEAR_BOX;
        this.on = on;
    }

    @Override
    protected void initialize()
    {

    }

    @Override
    protected void execute()
    {
       GearBox.setLever(on);
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