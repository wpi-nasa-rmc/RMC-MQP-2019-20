package frc.team2019;

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
    private static final int JoystickButtonChannel0 = 1;  // A
    private static final int JoystickButtonChannel1 = 2;  // B
    private static final int JoystickButtonChannel2 = 3;  // X
    private static final int JoystickButtonChannel3 = 4;  // Y
    private static final int JoystickButtonChannel4 = 5;  // Left Bumper
    private static final int JoystickButtonChannel5 = 6;  // Right Bumper
    private static final int JoystickButtonChannel6 = 7;  // Select
    private static final int JoystickButtonChannel7 = 8;  // Start
    private static final int JoystickButtonChannel8 = 9;  // L3
    private static final int JoystickButtonChannel9 = 10; // R3

    // Joystick Axis Channel Definition
    private static final int JoystickAxisChannel0 = 0; // L X-Axis
    private static final int JoystickAxisChannel1 = 1; // L Y-Axis
    private static final int JoystickAxisChannel2 = 2; // L Trigger (Iffy but does register range above 50%)
    private static final int JoystickAxisChannel3 = 3; // R Trigger (Again but does register range above 50%)
    private static final int JoystickAxisChannel4 = 4; // R X-Axis
    private static final int JoystickAxisChannel5 = 5; // R Y-Axis

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
        // For sensors. Don't know if we'll use during teleop until more advanced
        /*leftDrive.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);
        rightDrive.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0, 0);*/

        rightDrive.setSensorPhase(true);
        leftDrive.setNeutralMode(NeutralMode.Brake);
        rightDrive.setNeutralMode(NeutralMode.Brake);

        Gyro = new NavX(SPI.Port.kMXP);
    }
}
