package id.ac.sgu.commsultProject;

public class Blinds implements Actors {

	@Override
	public void updateStatus(Double value) {
		// TODO Auto-generated method stub
		if (checkValue(value)) {
			System.out.println("Close the blinds please");
		}
	}

	@Override
	public boolean checkValue(Double value) {
		// TODO Auto-generated method stub
		return true;
	}

}
