package frc.team2019.subsystems;


import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team2019.RobotMap;
import frc.team2019.commands.teleop.TeleOpDrivetrain;

public class Drivetrain extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private final WPI_TalonSRX m_rightDrive = RobotMap.rightDrive;
    private final WPI_TalonSRX m_leftDrive = RobotMap.leftDrive;
    private final DifferentialDrive m_drive = new DifferentialDrive(m_leftDrive,m_rightDrive);

    public Drivetrain() {
        this.m_drive.setSafetyEnabled(false);
        this.m_drive.setMaxOutput(1);
        this.m_drive.setDeadband(RobotMap.DeadZone);
    }

    public void initDefaultCommand() {
        // TODO: Set the default command, if any, for a subsystem here. Example:
        //    setDefaultCommand(new MySpecialCommand());

        setDefaultCommand(new TeleOpDrivetrain());
    }

    public void moveArcadeDrive(double YmoveValue, double rotateValue, boolean squareinput) {
        double m_YMoveValue = SqrtValueRetainSign(YmoveValue);
        double m_RotateValue = SqrtValueRetainSign(rotateValue);
        m_drive.arcadeDrive(m_YMoveValue, m_RotateValue, squareinput);
    }

    protected static double SqrtValueRetainSign(double num) {
        return (Math.abs(num)/num)*(num * num);
    }
}

