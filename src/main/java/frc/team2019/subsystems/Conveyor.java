package frc.team2019.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team2019.RobotMap;
import frc.team2019.commands.teleop.TeleopConveyor;

public class Conveyor extends Subsystem {

    private final WPI_TalonSRX conveyor = RobotMap.conveyor;

    public void initDefaultCommand() {
        setDefaultCommand(new TeleopConveyor());
    }

    public void run(int speed) {
        conveyor.set(speed);
    }
}

