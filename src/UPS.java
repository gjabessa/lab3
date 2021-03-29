
public class UPS extends Carrier {
	
	public UPS(double weight, String zone, String name) {
		super( weight, zone, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	double calculateRate() {
		// TODO Auto-generated method stub
		super.rate = 0.45 * super.weight;
		return super.rate;
		
	}
	
}
