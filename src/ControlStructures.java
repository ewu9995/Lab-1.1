// Evan Wu Lab 1.1 Due 9/28/17 
public class ControlStructures {
	public static void main(String [] args) {
		primePrinter();
		fooBarBaz();
		System.out.println("We're done!");
	}
	
	public static void primePrinter() {
		int number = 459;
		for (int x = 2; 2 * x <= number; x++) {
			if (((x++) % 2) == 0) {
				System.out.print(" " + x);
				
			}
	   }
	
	}
	

	
	public static void fooBarBaz() {
		
		for (int x = 1; x <= 500; x++) {
					
			if ((x % 3 == 0) && !((x % 3 == 0) && (x % 7 ==0)) && !((x % 3 == 0) && (x % 10 ==0)) && !((x % 3 == 0) && (x % 7 ==0) && (x % 10 == 0)))  {
			System.out.print(" "+"foo");
			} else if ((x % 7 == 0) && !((x % 3 == 0) && (x % 7 ==0)) && !((x % 7 == 0) && (x % 10 == 0)) && !((x % 3 == 0) && (x % 7 == 0) && (x % 10 == 0))) {
				System.out.print(" "+"Bar");
			} else if ((x % 10 == 0) && !((x % 3 == 0) && (x % 10 == 0)) && !((x % 7 == 0) && (x % 10 == 0)) && !((x % 3 == 0) && (x % 7 == 0) && (x % 10 == 0))) {
				System.out.print(" "+"baz");
			} else if ((x % 3 == 0) && (x % 7 ==0)) {
				System.out.print(" "+"fooBar");
			} else if ((x % 3 == 0) && (x % 10 ==0)) {
				System.out.print(" "+"foobaz");
			} else if ((x % 7 == 0) && (x % 10 ==0)) {
				System.out.print(" "+"Barbaz");
			} else if ((x % 3 == 0) && (x % 7 ==0) && (x % 10 == 0)) {
				System.out.print(" "+"fooBarbaz");
			} else {
				System.out.print(" " + x);
			}	
		}
	}
	
	
	
	public static void isPrime () {
		for (int x = 2; 2 *x <= 459; x++) {
			if (((x++) % 2) == 0) {
				System.out.println(x);
			}
		}
	}



}

