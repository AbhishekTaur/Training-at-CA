package fileDelete;

import java.io.File;

public class Filo {

	public static void main(String[] args) {
		try{
		String path = "C:/Agent/NIKKI_COPY.txt";
		File file = new File(path);
        String message = "hgghg";
        
        if(file.delete()){
			message = file.getName() + " is deleted!";
		}
        
        System.out.println(message);

	}
	catch(Exception e){
		System.out.println("LOL");
	}

}
}