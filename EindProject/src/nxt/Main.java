package nxt;

import lejos.nxt.Button;
import lejos.nxt.SensorPort;

public class Main {
	public static void main(String[] args) {
		//
		Button.waitForAnyPress();
		ColorSensor cs = new ColorSensor(SensorPort.S1, SensorPosition.Right);
		LightSensor ls = new LightSensor(SensorPort.S4, SensorPosition.Left);
		UltraSonicSensor us = new UltraSonicSensor(SensorPort.S2);
		new CalibrationController(cs, ls);
		new LineFollowController(cs, ls);
	}
}
