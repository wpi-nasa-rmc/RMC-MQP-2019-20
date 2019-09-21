package frc.team2019.commands.teleop;

import edu.wpi.first.wpilibj.command.Command;
import frc.team2019.Robot;
import frc.team2019.RobotMap;

public class TeleopDigger extends Command {

    @Override
    protected void execute() {
        if (Robot.oi.Pilot.getRawButton(RobotMap.DiggerDigForward)) {
            Robot.digger.run(1);
        } else if (Robot.oi.Pilot.getRawButton(RobotMap.DiggerDigReverse)) {
            Robot.digger.run(-1);
        } else {
            Robot.digger.run(0);
        }
    }

    @Override
    protected boolean isFinished() {
        return false;
    }
}
