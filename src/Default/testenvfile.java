package Default;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class testenvfile {
    public static void main(String args[]) throws FileNotFoundException {
        FileInputStream fs = new FileInputStream("./src/files/env.properties");
        //File directory = new File("./src/files");
        //System.out.println(directory.getAbsolutePath());
    }
}
