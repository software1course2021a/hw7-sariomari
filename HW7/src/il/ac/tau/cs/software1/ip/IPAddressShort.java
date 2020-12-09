package il.ac.tau.cs.software1.ip;

public class IPAddressShort implements IPAddress {
	private short[] ip;


	IPAddressShort(short[] address) {
		this.ip = address;
	}

	@Override
	public String toString() {
		String oct1 = Short.toString(ip[0]);
		String oct2 = Short.toString(ip[1]);
		String oct3 = Short.toString(ip[2]);
		String oct4 = Short.toString(ip[3]);
		String[] arr = {oct1,oct2,oct3,oct4};
		String res = String.join(".", arr);
		return res;
		
	}

	@Override
	public boolean equals(IPAddress other) {
		return this.toString().equals(other.toString());
	}

	@Override
	public int getOctet(int index) {
		return ip[index];
	}

	@Override
	public boolean isPrivateNetwork(){
		short oct1 = ip[0];
		short oct2 = ip[1];
		short oct3 = ip[2];
		short oct4 = ip[3];
		return IPAddress.checkPrivate(oct1, oct2, oct3, oct4);
	}
	
}
