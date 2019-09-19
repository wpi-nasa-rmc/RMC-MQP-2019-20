package frc.team2019.subsystems;


import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team2019.commands.teleop.TeleOpDrivetrain;

public class Drivetrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.


    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());

        setDefaultCommand(new TeleOpDrivetrain());
    }
}

