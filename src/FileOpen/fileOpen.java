package FileOpen;


import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;



public class fileOpen {

	public static void main(String[] args) throws IOException {
		
		File dir=new File("C:\\Users\\biswa\\eclipse-workspace\\FileOpen\\newfolder\\");
      //  File dir = new File(path);
        File[] files = dir.listFiles();

        Arrays.sort(files, new Comparator<File>() {
            public int compare(File f1, File f2) {
                return Long.valueOf(f2.lastModified()).compareTo(f1.lastModified());
            }
        });

        System.out.println("akjhkjahklh");
        for (int i = 0; i < files.length; i++) {
            
            // s=files[0].getName();
              String s = files[0].getPath();
              Desktop desktop=Desktop.getDesktop();
              
//              files[0].delete();
              System.out.println("Fille Delete");
  		
//              File dir1=new File(s);
//  			System.out.println(desktop);
//  			if(dir1.exists())
//  				desktop.open(dir1);
//            System.out.println(s);
            
            break;

        }
		

	}

}
