package org.usfirst.frc.team1350.robot.commands.shooter;

import org.usfirst.frc.team1350.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj.PWM;

/**
 *
 */
public class ShooterHome extends MoveActuator {
	
	private static PWM shooterTiltPWM = Shooter.getTiltPWM();
	private static AnalogInput shooterTiltFeedback = Shooter.getTiltFeedback();
	private static int homePosition = Shooter.TILT_HOME_PWM;
	private static float timeout = 4f;
	
    public ShooterHome() {
    	super(shooterTiltPWM, shooterTiltFeedback, homePosition, timeout);
    }

}
