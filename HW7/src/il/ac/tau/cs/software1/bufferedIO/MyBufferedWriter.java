package il.ac.tau.cs.software1.bufferedIO;

import java.io.FileWriter;
import java.io.IOException;


/**************************************
 *  Add your code to this class !!!   *
 **************************************/

public class MyBufferedWriter implements IBufferedWriter{
	private int bufferSize;
	private FileWriter fW;
	private int index;
	private String curr;

	public MyBufferedWriter(FileWriter fWriter, int bufferSize){
		this.bufferSize = bufferSize;
		this.fW = fWriter;
		this.index = 0;
		this.curr = "";
	}

	public String getCurr() {
		return this.curr;
	}
	@Override
	public void write(String str) throws IOException {
		int n = str.length();
		for (int i=0; i<n; i++) {
			this.index += 1;
			this.curr += str.charAt(i);
			if (this.index == bufferSize) {
				fW.write(curr);
				this.index = 0;
				this.curr = "";
			}
		}
		

	}
	
	@Override
	public void close() throws IOException {
		if (this.curr.length() != 0) { //if there are extra words left in the buffer
			fW.write(curr);
			this.index = 0;
			this.curr = "";
		}
		fW.close();
	}

}