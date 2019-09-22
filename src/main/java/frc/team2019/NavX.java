//package frc.team2019;
//
//import com.kauailabs.navx.frc.AHRS;
//import edu.wpi.first.wpilibj.PIDSource;
//import edu.wpi.first.wpilibj.SPI;
//
//public class NavX extends AHRS implements PIDSource {
//    private double SetAngleTarget = 0;
//
//    NavX(SPI.Port spi_port_id) {
//        super(spi_port_id);
//    }
//
//    public int getAngleCorrection() {
//        return (int) (SetAngleTarget - getFusedHeading());
//    }
//
//    public double getAngleTarget() {
//        return SetAngleTarget;
//    }
//
//    public void setAngleTarget(double newAngle) {
//        SetAngleTarget = newAngle;
//    }
//}
