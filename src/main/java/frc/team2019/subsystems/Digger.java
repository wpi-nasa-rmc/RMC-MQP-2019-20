package frc.team2019.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team2019.RobotMap;
import frc.team2019.commands.teleop.TeleopDigger;

public class Digger extends Subsystem {

    private final WPI_TalonSRX diggerBucket = RobotMap.diggerBucket;

    public void initDefaultCommand() {
        setDefaultCommand(new TeleopDigger());
    }

    public void run(int speed) {
        diggerBucket.set(speed);
    }
}

