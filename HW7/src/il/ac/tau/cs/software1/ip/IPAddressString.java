package il.ac.tau.cs.software1.ip;

public class IPAddressString implements IPAddress {
	private String ip;

	IPAddressString(String address) {
		this.ip = address;
	}

	@Override
	public String toString() {
		return this.ip;
	}

	@Override
	public boolean equals(IPAddress other) {
		return this.toString().equals(other.toString());
	}

	@Override
	public int getOctet(int index) {
		String[] array = ip.split("\\.");
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
