import java.util.stream.IntStream;

public class Carrier {
	double rate;
	double weight;
	String zone;
	int numberOfPackage;
	String name;
	
	FedEx fedex;
	UPS ups;
	USMail usMail;
	

	double calculateRate() {
		return 0;
	}

	Carrier getLowestRateCarrier() {
		Carrier carrier;
		fedex = new FedEx(weight, zone, name);
		ups = new UPS(weight, zone, name);
		usMail = new USMail(weight, zone, name);
		carrier=fedex.calculateRate()<ups.calculateRate()?fedex:ups; 
		
		carrier=usMail.calculateRate()<carrier.calculateRate()?usMail:carrier;
		
		return carrier;
	}
	
	public Carrier(double weight, String zone, String name) {
		super();
		this.weight = weight;
		this.zone = zone;
		this.name = name;
		
	}
	
	
	
}
