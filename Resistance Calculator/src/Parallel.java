
public class Parallel extends Resistance {
	
	public double req() {
		double req = 0;
		for(int i=0; i<resistors.length; i++) {
			if(resistors[i]==0) {
				System.err.println("The circuit is shorted!!");
				return 0;
			}
			req = req + (1/resistors[i]);
		}
		return 1/req;
	}
}
