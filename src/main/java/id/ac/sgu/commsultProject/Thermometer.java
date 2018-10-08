package id.ac.sgu.commsultProject;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Thermometer implements Sensors {
	
	private Double measurement;
	private PropertyChangeSupport support;
	
	public Thermometer(PropertyChangeListener pcl) {
		support = new PropertyChangeSupport(this);
		addPropertyChangeListener(pcl);
	}

	@Override
	public void updateMeasurement(Double measurement) {
		// TODO Auto-generated method stub
		support.firePropertyChange("Temperature measurement", this.measurement, measurement);
	}

	@Override
	public void setMeasurement(Double measurement) {
		// TODO Auto-generated method stub
		updateMeasurement(measurement);
		this.measurement = measurement;
	}

	@Override
	public Double getMeasurement() {
		// TODO Auto-generated method stub
		return measurement;
	}

	@Override
	public void addPropertyChangeListener(PropertyChangeListener pcl) {
		// TODO Auto-generated method stub
		support.addPropertyChangeListener(pcl);
	}

	@Override
	public void removePropertyChangeListener(PropertyChangeListener pcl) {
		// TODO Auto-generated method stub
		support.removePropertyChangeListener(pcl);
	}

}
