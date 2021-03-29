
public class USMail extends Carrier{

	public USMail( double weight, String zone, String name) {
		super(weight, zone, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateRate() {
		// TODO Auto-generated method stub
		if(super.weight < 3) {
			super.rate = 1;
		} else {
			super.rate = super.weight * 0.55;
		}
		return super.rate;
		
	}
	
}
