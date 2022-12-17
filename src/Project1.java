import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Project1 {
	public static void ListAllFiles() {
		File directoryPath =new File("C:\\Users\\tsshu\\eclipse-workspace\\Lockers ME PvtLtd\\FilesDirectory");
		String contents[] = directoryPath.list();
		System.out.println("List of all Games in the Directory");
		for(int i=0;i<contents.length;i++) {
			System.out.println(contents[i]);
		}		
	}
	public static void AddFile(String name) {
		File myobj = new File("C:\\Users\\tsshu\\eclipse-workspace\\Lockers ME PvtLtd\\FilesDirectory"+"\\"+name);
		try{if(myobj.createNewFile()) {
			System.out.println("New File is created: "+ myobj.getName());
		}else {
			System.out.println("File already Exist");
		}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	public static void DeleteFile(String name) {
		File file = new File("C:\\Users\\tsshu\\eclipse-workspace\\Lockers ME PvtLtd\\FilesDirectory"+"\\"+name);
		if(file.delete()) {
			System.out.println("File is Succesfully removed");
		}else {
			System.out.println("File Not Found");
		}
	}
	public static void SearchingFile(String name){
		File file = new File("C:\\Users\\tsshu\\eclipse-workspace\\Lockers ME PvtLtd\\FilesDirectory");
		String[] search = file.list();
		int flag=0;
		if(search==null) {
			System.out.println("Empty Directory");
		}else {
		for(int i=0;i<search.length;i++) {
			String FileName= search[i];
			if(FileName.equalsIgnoreCase(name)) {
				System.out.println(FileName+" File is Found");
				flag=1;
			}
		}
		
	}
		if(flag==0) {
			System.out.println("File Not Found");
		}
	}
	
public static void main(String[] args) {
	Project1 p1 = new Project1();
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	while(flag) {
		System.out.println("1. Display all the Files");
		System.out.println("2. Add a File");
		System.out.println("3. Delete a File");
		System.out.println("4. Search The File");
		System.out.println("5. Exit");
        System.out.println("Enter Your Choice");
        String name;
		int choice = sc.nextInt(); 
		
		switch(choice){
		
		case 1:
			p1.ListAllFiles();
			break;
			
		case 2:
			System.out.println("Enter the file name with extension For Adding");
			name = sc.next();
			p1.AddFile(name);
			break;
		case 3:
			System.out.println("Enter the file name with extension For Deleting");
			name = sc.next();
			p1.DeleteFile(name);
			break;
		case 4: 
			System.out.println("Enter the file name with extension for Searching");
			name = sc.next();
			p1.SearchingFile(name);
			break;
		case 5: 
			flag=false;
			break;
		default:
			System.out.println("Invalid Choices");
		}
		
	}
	System.out.println("Developed by:- Shubham Goyal ");
	System.out.println("Project Name :- LockersME Pvt Ltd");
	

}
}
