package id.ac.sgu.commsultProject;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;

public class MainController implements PropertyChangeListener {
	
	public Double measurement;
	public ArrayList<Actors> actors = new ArrayList<Actors>();

	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		// TODO Auto-generated method stub
		System.out.println(evt.getPropertyName() + " " + evt.getOldValue());
		System.out.println(evt.getPropertyName() + " " + evt.getNewValue());
		if (isTemperature(evt)) {
			
		}
		else if (isWind(evt)) {
			
		}
		else if (isTime(evt)) {
			
		}
	}

	private boolean isTime(PropertyChangeEvent evt) {
		return evt.getPropertyName().equalsIgnoreCase("Time");
	}

	private boolean isWind(PropertyChangeEvent evt) {
		return evt.getPropertyName().equalsIgnoreCase("Wind");
	}

	private boolean isTemperature(PropertyChangeEvent evt) {
		return evt.getPropertyName().equalsIgnoreCase("Temperature");
	}

}
