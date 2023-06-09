package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadData {
	public static void main(String[] args) throws IOException {
		try {
			FileInputStream fin = new FileInputStream("C:\\Users\\katew\\OneDrive\\Desktop\\java program edubridge\\"
					+ "EduBridge-Java-course--main\\java program edubridge\\coreJavaPrograms\\src\\FileHandling\\Demo.txt");
			int i;
			FileOutputStream fout =new FileOutputStream("OutFile.txt");
			while(( i=fin.read())!=-1) {
				fout.write(i);
				fin.close();
				fout.close();
			}
		//System.out.println((char)i);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
