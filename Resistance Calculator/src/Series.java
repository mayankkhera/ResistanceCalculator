
public class Series extends Resistance {
	
	public double req() {
		double req = 0;
		for(int i=0; i<resistors.length;i++) {
			req = req + resistors[i];
		}
		return req;
	}
}
