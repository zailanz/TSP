import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class TSP {

	/**
	 * Sample input
	 * 10
	 * 95.0129 61.5432
	 * 23.1139 79.1937
	 * 60.6843 92.1813
	 * 48.5982 73.8207
	 * 89.1299 17.6266
	 * 76.2097 40.5706
	 * 45.6468 93.5470
	 * 1.8504 91.6904
	 * 82.1407 41.0270
	 * 44.4703 89.3650
	 */
	public static void main(String[] args) {
		// TODO Krama Jens
		try{
			
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			
			String inLine = in.readLine();
			int numberOfPoints = Integer.parseInt(inLine);
			
			while (in.ready()) {
				String s = in.readLine();
				String[] a = s.split(" ");
				System.out.println("X: " + a[0] + " y: " + a[1]);
			}
			 
			ArrayList<String> integers = new ArrayList<String> ();
			String numberString;
			while (in.ready()){
				numberString = in.readLine();
				integers.add(numberString);
			}
	
			String[] toFactor = new String[integers.size()];
			for (int i=0;i<integers.size();i++){
				toFactor[i] = integers.get(i);
			}

		} catch (Exception e){
			e.printStackTrace();
		}
	}

}