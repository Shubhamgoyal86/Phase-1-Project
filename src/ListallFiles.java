import java.io.IOException;
import java.io.*;
public class ListallFiles {

	public static void main(String args[]) throws IOException{
		File directoryPath =new File("C:\\Users\\tsshu\\eclipse-workspace\\Lockers ME PvtLtd\\FilesDirectory");
		String contents[] = directoryPath.list();
		System.out.println("List of all Games in the Directory");
		for(int i=0;i<contents.length;i++) {
			System.out.println(contents[i]);
		}
		
	}
}
