package il.ac.tau.cs.software1.ip;
import java.awt.List;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public class IPAddressInt implements IPAddress {
	private int ip;

	IPAddressInt(int address) {
		this.ip = address;
	}

	@Override
	public String toString() {
		String binString = Integer.toBinaryString(this.ip);
		int i=0;
		String curr = "";
		ArrayList<String> array = new ArrayList<String>();
		while (i < 33) {
			if (i%8 == 0 && !curr.equals("")) {
				short a = Short.parseShort(curr,2);
				array.add(Short.toString(a));
				curr = "";
			}
			if (i<32) {
				curr += binString.charAt(i);
			}
			i++;
		}
		return String.join(".", array);
	}

	@Override
	public boolean equals(IPAddress other) {
		return this.toString().equals(other.toString());
	}

	@Override
	public int getOctet(int index) {
		String[] array = this.toString().split("\\.");
		return Integer.parseInt(array[index]);
		
	}

	@Override
	public boolean isPrivateNetwork(){
		int oct1 = getOctet(0);
		int oct2 = getOctet(1);
		int oct3 = getOctet(2);
		int oct4 = getOctet(3);
		return IPAddress.checkPrivate(oct1, oct2, oct3, oct4);
		
	}
	
}
