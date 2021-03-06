package com.team2502.robot2017.chooser;

import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;


@SuppressWarnings({ "unchecked", "SameParameterValue", "SpellCheckingInspection" })
public class TypeSendableChooser<T> extends SendableChooser
{
    public void addObjectT(String name, T object)
    {
        super.addObject(name, object);
    }

    public void addDefaultT(String name, T object)
    {
        super.addDefault(name, object);
    }

    @SuppressWarnings("unchecked")
    public T getSelectedT()
    {
        return (T) getSelected();
    }
}
