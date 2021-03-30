import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	public static void main(String[] args) throws IOException {
		Carrier[] carriers = {
				new Carrier(2,"IA","Book"), new Carrier(4,"MA","Phone"), 
				new Carrier(6,"NY","Boots") 
		};
		
		putText("For example");
		for(Carrier carrier: carriers) {
			
			printLowest(carrier);
		}
		
		
		while(true) {
			
			putText("Enter weight in terms of pound");
			double weight = getDouble();
			putText("Enter product description");
			String name = getString();
			putText("Enter zone");
			String zone = getString();
			
			Carrier carrier = new Carrier(weight, zone, name);
			printLowest(carrier);
			putText("Press Q any time to exit or press Enter to continue"+"\n");
			
			if( getString().equals("Q")) {
				break;
			}
		}
		
		
	}
	
	  private static void printLowest(Carrier carrier) {
		  System.out.println(carrier.description + " " + getLowestRateCarrier(carrier).rate + " " + getLowestRateCarrier(carrier).getClass().toString());
		
	}

	private static void putText(String string) {
		  System.out.println(string);
		
	}

	public static String getString() throws IOException  //reads a string from the keyboard input
      {
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br = new BufferedReader(isr);
      String s = br.readLine();
      return s;
      }
	  
	  public static double getDouble() throws IOException // reads an double from the keyboard input
      {
      String s = getString();
      return (Double.valueOf(s)).doubleValue();
      }


	  
	  static Carrier getLowestRateCarrier(Carrier carrier) {
		  double weight = carrier.weight;
		  String zone = carrier.zone; 
		  String description = carrier.description;
		  FedEx fedex;
			UPS ups;
			USMail usMail;
			fedex = new FedEx(weight, zone, description);
			ups = new UPS(weight, zone, description);
			usMail = new USMail(weight, zone, description);
			carrier=fedex.calculateRate()<ups.calculateRate()?fedex:ups; 
			
			carrier=usMail.calculateRate()<carrier.calculateRate()?usMail:carrier;
			
			return carrier;
		}


}
