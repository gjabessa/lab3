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
			
			putText("Enter weight");
			double weight = getDouble();
			putText("Enter name");
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
		  System.out.println(carrier.name + " " + carrier.getLowestRateCarrier().rate + " " + carrier.getLowestRateCarrier().getClass().toString());
		
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


//	public static double calculateLowestPrice(double weight, String zone, String description) {
//		Carrier fedEx = new FedEx(2,"IA","Book");
//		Carrier uPS = new UPS(2,"IA","Book");
//		Carrier uSMail = new USMail(2,"IA","Book");
//		
//		
//		fedEx.calculateRate(), uPS.calculateRate(), uSMail.calculateRate()
//		
//	}


}
