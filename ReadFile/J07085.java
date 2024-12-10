package ReadFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.math.BigInteger;
import java.util.ArrayList;

public class J07085 {
	public static void main(String arg[]) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream os = new ObjectInputStream(new FileInputStream("DATA.in"));
		ArrayList<String> arr =  (ArrayList<String>) os.readObject();
		os.close();
		for(String x : arr) {
			String tmp = "";
			long sum = 0;
			for(int i = 0; i <x.length(); i++) {
				if(x.charAt(i) >= '0' && x.charAt(i) <= '9') {
					tmp+= x.charAt(i);
					sum += x.charAt(i) - '0';
				}
			}
			BigInteger largeNum = new BigInteger(tmp);
			System.out.println(largeNum + " " + sum);
		}
	}
}
