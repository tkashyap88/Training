

public class Sum {
	
	int sellingPrice;
    int taxandShipment;
    int totalPrice;
	
	void input() {
		sellingPrice=100;
		taxandShipment=20;	
	}
	
	void calculate() {
		
		totalPrice = sellingPrice+taxandShipment;
		System.out.println("The total Price is " +totalPrice);
	}
	
	public static void main (String [] args ) {
		
		Sum s =new Sum ();
		s.input();
	s.calculate();
	
	

		//if (sellingPrice = 0) {
			
		//	System.out.println ("Please enter a value for selling price"+sellingPrice);
		}
	}
