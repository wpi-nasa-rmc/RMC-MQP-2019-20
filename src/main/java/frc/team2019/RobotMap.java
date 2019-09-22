package frc.team2019;

import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import edu.wpi.first.wpilibj.PowerDistributionPanel;
import edu.wpi.first.wpilibj.SPI;

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
    public static final int JoystickButtonChannel0 = 0; // A
    public static final int JoystickButtonChannel1 = 1; // B
    public static final int JoystickButtonChannel2 = 2; // X
    public static final int JoystickButtonChannel3 = 3; // Y
    public static final int JoystickButtonChannel4 = 4; // Left Bumper
    public static final int JoystickButtonChannel5 = 5; // Right Bumper
    public static final int JoystickButtonChannel6 = 6; // Select
    public static final int JoystickButtonChannel7 = 7; // Start
    public static final int JoystickButtonChannel8 = 8; // L3
    public static final int JoystickButtonChannel9 = 9; // R3

    // Joystick Axis Channel Definition
    public static final int JoystickAxisChannel0 = 0; // L X-Axis
    public static final int JoystickAxisChannel1 = 1; // L Y-Axis
    public static final int JoystickAxisChannel2 = 2; // L Trigger (Iffy but does register range above 50%)
    public static final int JoystickAxisChannel3 = 3; // R Trigger (Again but does register range above 50%)
    public static final int JoystickAxisChannel4 = 4; // R X-Axis
    public static final int JoystickAxisChannel5 = 5; // R Y-Axis

    // Pilot Controller
    public static final int DrivetrainAxisForward = JoystickAxisChannel3;
    public static final int DrivetrainAxisBackward = JoystickAxisChannel2;
    public static final int DrivetrainAxisLeftandRight = JoystickAxisChannel0;
    public static final int DrivetrainAxisRotate = JoystickAxisChannel4;
    public static final int DiggerDigForward = JoystickButtonChannel5;
    public static final int DiggerDigReverse = JoystickButtonChannel4;
    public static final int ConveyorForward = JoystickButtonChannel0;
    public static final int ConveyorReverse = JoystickButtonChannel1;
    public static final int DiggerDown = JoystickButtonChannel2;
    public static final int DiggerUp = JoystickButtonChannel3;

    // Gyro
    public static NavX Gyro;

    public static PowerDistributionPanel PDP;

    public static void init() {
        // Drive Train config
        PDP = new PowerDistributionPanel(0);
        leftDrive.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
        rightDrive.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);

        rightDrive.setSensorPhase(true);
        leftDrive.setNeutralMode(NeutralMode.Brake);
        rightDrive.setNeutralMode(NeutralMode.Brake);

        Gyro = new NavX(SPI.Port.kMXP);
    }
}
