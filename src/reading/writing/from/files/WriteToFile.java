package reading.writing.from.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		
		try {
			
			File file = new File("Teams.txt");
			
			if(!file.exists()){
				file.createNewFile();
			}
			
			FileWriter fr = new FileWriter(file, true);
			BufferedWriter bw = new BufferedWriter(fr);

			bw.write("\nI LOOOOVEEEEE YOU");
			
			bw.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		
	}

}
