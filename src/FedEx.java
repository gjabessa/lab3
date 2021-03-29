
public class FedEx extends Carrier {
	public FedEx( double weight, String zone, String name) {
		super(weight, zone,name);
		// TODO Auto-generated constructor stub
	}
	@Override
	double calculateRate() {
		// TODO Auto-generated method stub
		double zoneRate; 
		if(super.zone.equals("IA") || super.zone.equals("MT") || super.zone.equals("CA")) {
			zoneRate = 0.35;
		} else if(super.zone.equals("TX") || super.zone.equals("UT") ) {
			zoneRate = 0.30;
		} else if (super.zone.equals("FL") || super.zone.equals("MA") || super.zone.equals("OH")) {
			zoneRate = 0.55;
		} else {
			zoneRate = 0.43;
		}
		super.rate = zoneRate * super.weight;
		return super.rate;
	}

	
	

	
}
