package id.ac.sgu.commsultProject;

public class Lights implements Actors {

	@Override
	public void updateStatus(Double value) {
		// TODO Auto-generated method stub
		if (checkValue(value)) {
			System.out.println("Cant hear you, too dark");
		}
	}

	@Override
	public boolean checkValue(Double value) {
		// TODO Auto-generated method stub
		return true;
	}

}
