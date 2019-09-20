package frc.team2019;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.PowerDistributionPanel;

public class RobotMap {
    // Drive Train definition
    public static WPI_TalonSRX leftDrive = new WPI_TalonSRX(1);
    public static WPI_TalonSRX rightDrive = new WPI_TalonSRX(2);
    public static final double DeadZone = 0.05;

    // Digger definition
    public static WPI_TalonSRX conveyor = new WPI_TalonSRX(3);
    public static WPI_TalonSRX diggerBucket = new WPI_TalonSRX(4);
    public static WPI_TalonSRX diggerDepth = new WPI_TalonSRX(5);

    // Joystick Button Channel Definition
    public static final int JoystickButtonChannel0=0;
    public static final int JoystickButtonChannel1=1;
    public static final int JoystickButtonChannel2=2;
    public static final int JoystickButtonChannel3=3;
    public static final int JoystickButtonChannel4=4;
    public static final int JoystickButtonChannel5=5;
    public static final int JoystickButtonChannel6=6;
    public static final int JoystickButtonChannel7=7;
    public static final int JoystickButtonChannel8=8;

    // Joystick Axis Channel Definition
    public static final int JoystickAxisChannel0=0;
    public static final int JoystickAxisChannel1=1;
    public static final int JoystickAxisChannel2=2;
    public static final int JoystickAxisChannel3=3;
    public static final int JoystickAxisChannel4=4;
    public static final int JoystickAxisChannel5=5;
    public static final int JoystickAxisChannel6=6;
    public static final int JoystickAxisChannel7=7;

    // Pilot Controller
    public static final int DrivetrainAxisForward=JoystickAxisChannel3;
    public static final int DrivetrainAxisBackward=JoystickAxisChannel2;
    public static final int DrivetrainAxisLeftandRight=JoystickAxisChannel0;
    public static final int DrivetrainAxisRotate=JoystickAxisChannel4;
    public static final int DriverWinchRunOut=JoystickButtonChannel3;
    public static final int DriverWinchRunIn=JoystickButtonChannel2;
    public static final int DriverSpeedHigh= JoystickButtonChannel4;
    public static final int DriverSpeedLow= JoystickButtonChannel1;



    public static PowerDistributionPanel PDP;

    public static void init() {
        // Drive Train config
        PDP = new PowerDistributionPanel(0);
        leftDrive.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
        rightDrive.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);

        rightDrive.setSensorPhase(true);
        leftDrive.setNeutralMode(NeutralMode.Brake);
        rightDrive.setNeutralMode(NeutralMode.Brake);
    }
}
