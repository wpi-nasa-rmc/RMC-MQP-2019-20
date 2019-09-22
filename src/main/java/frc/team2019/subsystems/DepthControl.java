package frc.team2019.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.team2019.RobotMap;
import frc.team2019.commands.teleop.TeleopDepthControl;

public class DepthControl extends Subsystem {

    private WPI_TalonSRX diggerDepth = RobotMap.diggerDepth;

    public void initDefaultCommand() {
        setDefaultCommand(new TeleopDepthControl());
    }

    public void run(double speed) {
        diggerDepth.set(speed);
    }
}

