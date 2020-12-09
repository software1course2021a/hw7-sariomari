package il.ac.tau.cs.software1.ip;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class TestIPAddress {

	public static void main(String[] args) {
		int address1 = -1062731775; // 192.168.0.1
		short[] address2 = { 10, 1, 255, 1 }; // 10.1.255.1
		short[] address5 = {10, 0, 0, 15};

		IPAddress ip1 = IPAddressFactory.createAddress(address1);
		System.out.println(ip1.toString());
		IPAddress ip2 = IPAddressFactory.createAddress(address2);
		IPAddress ip3 = IPAddressFactory.createAddress("127.0.0.1");
		IPAddress ip4 = IPAddressFactory.createAddress("192.168.0.1");
		IPAddress ip5 = IPAddressFactory.createAddress(address5);
		System.out.println("ip5: " + ip1.toString());

//		for (int i = 0; i < 4; i++) {
//			System.out.println(ip3.getOctet(i));
//			
//		}
//		System.out.println("equals: " + ip1.equals(ip4));
		System.out.println("Is private Network: " + ip1.isPrivateNetwork());
		System.out.println("Is private Network: " + ip4.isPrivateNetwork());
		
	}
}
