package file;

import java.io.*;
public class CopyFile {
	
	
	private static void createArtifactRest(FileOutputStream out,String Halo){
		int i=0;
        while(i<Halo.length()){
       	 try {
			out.write(Halo.charAt(i));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       	 i++;
        }
	}

   public static void main(String args[]) throws IOException {  
      FileInputStream in = null;
      FileOutputStream out = null;

      try {
         in = new FileInputStream("input.txt");
         out = new FileOutputStream("C:/Users/TAUAB01/workspace/FileReader/src/file/output.txt");
         
         int c;
         while ((c = in.read()) != -1) {
            out.write(c);
         }
         String Halo ="This is the Halo string and what is it";
         createArtifactRest(out,Halo);
      }finally {
         if (in != null) {
            in.close();
         }
         if (out != null) {
            out.close();
         }
      }
   }
}