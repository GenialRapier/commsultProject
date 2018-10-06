package id.ac.sgu.commsultProject;

public class AirConditioning implements Actors{

	@Override
	public void updateStatus(Double value) {
		// TODO Auto-generated method stub
		if (checkValue(value)) {
			System.out.println("Its cold in here");
		}
	}

	@Override
	public boolean checkValue(Double value) {
		// TODO Auto-generated method stub
		return true;
	}

}
