package il.ac.tau.cs.software1.bufferedIO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedIOTester {
	public static final String RESOURCES_FOLDER = "resources/hw7/out/";

	public static void main(String[] args) throws IOException{
		String outputFileName = RESOURCES_FOLDER + "rocky1_out.txt";
		String outputFileName2 = RESOURCES_FOLDER + "foo.txt";
		
		String outString1 = "Now somewhere in the Black mining Hills of Dakota\nThere lived a young boy named Rocky Raccoon,\n"; 
		String outString2 = "And one day his woman";
		String outString3 = " ran off with another guy,\nHit young Rocky in the eye.";
		
		String outString4 = "Is someone getting the best, the best, the best, the best of you?\n";
		String outString5 = "Is someone getting the best, the best, the best, the best of you?\nHas someone";
		String outString6 = " taken your faith?\nIts real, the pain you feel\n";
		String outString7 = "You trust, you must\nConfess";
		
		FileWriter fWriter = new FileWriter(new File(outputFileName));
		FileWriter fWriter2 = new FileWriter(new File(outputFileName2));
		
		IBufferedWriter bW = new MyBufferedWriter(fWriter, 10);
		IBufferedWriter bW2 = new MyBufferedWriter(fWriter2, 5);
		
		bW.write(outString1);
		bW.write(outString2);
		bW.write(outString3);
		bW.close();
		
		bW2.write(outString4);
		bW2.write(outString5);
		bW2.write(outString6);
		bW2.write(outString7);
		bW2.close();
		
		/*
		 * The output file this tester creates should be identical to rocky1_correct.txt
		 * 
		 */
	}
}
