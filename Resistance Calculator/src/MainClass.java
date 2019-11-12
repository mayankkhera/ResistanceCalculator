import java.util.Scanner;
import java.text.DecimalFormat;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Welcome to the equivalent resistance calculator");
		System.out.println("                               -By Mayank Khera");
		System.out.println("===============================================");
		DecimalFormat df = new DecimalFormat("#.###");
		Scanner input = new Scanner(System.in);
		Resistance circuit = new Resistance();;
		boolean isValid = false;
		
		do {
			System.out.print("Connection type: ");
			char ctype = input.next().charAt(0);
			if(ctype=='s'||ctype=='S') {
				circuit = new Series();
				isValid = true;
			}else if(ctype=='p'||ctype=='P') {
				circuit = new Parallel();
				isValid = true;
			}else {
				System.err.println("Invalid input!!");
			}
		}while(!isValid);
		
		isValid = false;
		int nR=0;
		
		do {
			System.out.print("Enter number of resistors: ");
			if(input.hasNextInt()) {
				nR = input.nextInt();
				isValid = true;
				if(nR<2) {
					System.out.println("Number of resistors cannot be less than 2");
					isValid = false;
				}
			}
		}while(!isValid);
		
		circuit.rinput(nR,input);
		
		System.out.println("Total resistance in the circuit is "+df.format(circuit.req())+" ohms");

	}

}
