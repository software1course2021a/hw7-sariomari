package il.ac.tau.cs.software1.ip;

public class IPAddressString implements IPAddress {

	IPAddressString(String address) {
	}

	@Override
	public String toString() {
		return null;
	}

	@Override
	public boolean equals(IPAddress other) {
		return false;
	}

	@Override
	public int getOctet(int index) {
		return 0;
	}

	@Override
	public boolean isPrivateNetwork(){
		return false;
	}
	
}
