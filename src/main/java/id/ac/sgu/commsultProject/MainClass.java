package id.ac.sgu.commsultProject;

public class MainClass {
	public static void main(String[] args) {
		MainController observer = new MainController();
		Sensors thermometer = new Thermometer(observer);
		Sensors anemometer = new Anemometer(observer);
		Sensors clock = new Clock(observer);
		
		thermometer.setMeasurement(50.0);
		anemometer.setMeasurement(12.0);
		clock.setMeasurement(43.0);
		
		thermometer.setMeasurement(25.0);
		anemometer.setMeasurement(15.0);
		clock.setMeasurement(37.0);
		
		thermometer.setMeasurement(75.0);
		anemometer.setMeasurement(10.0);
		clock.setMeasurement(86.0);
	}

}
