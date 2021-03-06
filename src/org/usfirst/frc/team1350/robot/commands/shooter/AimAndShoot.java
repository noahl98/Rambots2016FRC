package org.usfirst.frc.team1350.robot.commands.shooter;

import org.usfirst.frc.team1350.robot.Log;
import org.usfirst.frc.team1350.robot.subsystems.Shooter;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class AimAndShoot extends CommandGroup {
	
	// Ramp up time in seconds
//	private static double rampUpDelay = 2;
//	private static double rampDownDelay = 1; // after ball exits run for this # of seconds

	// -1.0 to 1.0
//	private static double shootSpeed = 1.0;	
//	private static double shooterTimeout = 10;
	private static double adjustTiltSpeed = .7d;

	public AimAndShoot() {
		Log.info("Shooting");
//		addSequential(new RampAndShootBallGroup(shootSpeed, rampUpDelay, rampDownDelay, shooterTimeout));
		//addSequential(new RetractBallActuator());
		
		addSequential(new ShooterHome());
		
		addSequential(new AdjustShooter(70, adjustTiltSpeed));
	//	addSequential(new ShootBall(shootSpeed, rampDownDelay, shooterTimeout));
	}
	

}
