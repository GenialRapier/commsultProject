package id.ac.sgu.commsultProject;

public interface Sensors {
	public void updateMeasurement();
	public void setMeasurement(Double measurement);
	public Double getMeasurement();
	public void addPropertyChangeListener();
	public void removePropertyChangeListener();
}
