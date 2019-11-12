import java.util.Scanner;

public class Resistance {
	double[] resistors;
	int nResistors;
	
	public Resistance() {
		nResistors = 2;
		resistors = new double[nResistors];
	}//default constructor - allocates memory Resistance mo = new Resistance();
	
	public void rinput(int nResistors, Scanner input) {
		this.nResistors = nResistors;
		resistors = new double[nResistors];
		System.out.println("Enter resitance in ohms");
		for(int i=0; i<resistors.length; i++) {
			boolean isValid = false;
			do{
				System.out.print("Enter resistor number "+(i+1)+": ");
				if(input.hasNextDouble()) {
				resistors[i] = input.nextDouble();
				isValid = true;
				}else {
					System.err.println("Invalid input!!");
				}
			}while(!isValid);
		}
	}
	
	public double req() {
		return 0;
	}
	
	
}
