// Evan Wu Lab 1.1 Due 9/28/17 
public class ControlStructures {
	public static void main(String [] args) {
		primePrinter();
		System.out.print("\n");
		fooBarBaz();
		System.out.print("\n");
		System.out.print(" " + "We're done!");
	}
	
	public static void primePrinter() {
		int x = 0;
		int number = 0;
		int count=0;
		String primeNumber = "";
		for (x = 1;  x <= 229; x++) {
			int counter=0;
			for (number=x; number>=1; number--) {
			
			if (x % number == 0) {
				counter = counter +1;
				}
			}
			if (counter==2) {
				System.out.print(" " +x);
				count ++;
			if (count==10) {
				System.out.print("\n");
				count =0;
			}
			primeNumber = primeNumber + x + " ";
			}
		}
	}
	
		
	public static void fooBarBaz() {
		
		for (int x = 1; x <= 500; x++) {
					
			if ((x % 3 == 0) && !((x % 3 == 0) && (x % 7 ==0)) && !((x % 3 == 0) && (x % 10 ==0)) && !((x % 3 == 0) && (x % 7 ==0) && (x % 10 == 0)))  {
			System.out.print(" "+"foo");
			} else if ((x % 7 == 0) && !((x % 3 == 0) && (x % 7 ==0)) && !((x % 7 == 0) && (x % 10 == 0)) && !((x % 3 == 0) && (x % 7 == 0) && (x % 10 == 0))) {
				System.out.print(" "+"bar");
			} else if ((x % 10 == 0) && !((x % 3 == 0) && (x % 10 == 0)) && !((x % 7 == 0) && (x % 10 == 0)) && !((x % 3 == 0) && (x % 7 == 0) && (x % 10 == 0))) {
				System.out.print(" "+"baz");
			} else if ((x % 3 == 0) && (x % 7 ==0) && !((x % 3 == 0) && (x % 7 ==0) && (x % 10 == 0))) {
				System.out.print(" "+"foobar");
			} else if ((x % 3 == 0) && (x % 10 ==0) && !((x % 3 == 0) && (x % 7 ==0) && (x % 10 == 0))) {
				System.out.print(" "+"foobaz");
			} else if ((x % 7 == 0) && (x % 10 ==0) && !((x % 3 == 0) && (x % 7 ==0) && (x % 10 == 0))) {
				System.out.print(" "+"barbaz");
			} else if ((x % 3 == 0) && (x % 7 ==0) && (x % 10 == 0)) {
				System.out.print(" "+"foobarbaz");
			} else {
				System.out.print(" " +x);
			}	
		}
	}
	
	
	// Not used
	public static boolean isPrime(int x) {
		int number = 459;
		for  (x = 2; 2 *x <= number; x++) {
			if (number % x == 0) {
				return false;
			}
		}
		return true;
	}



}

