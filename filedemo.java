```java
package filedemo;

import java.io.*;

public class FileDemo {

    public static void main(String[] args) {

        File file = new File("Reactangle.java");

        System.out.println("File Exist....> " + file.exists());
        System.out.println("Length of File > " + file.length());
        System.out.println("Can file read > " + file.canRead());
        System.out.println("Can file write > " + file.canWrite());
        System.out.println("Whether file is File > " + file.isFile());
        System.out.println("File Absolute path > " + file.getAbsolutePath());

        // Writing into file
        try {
            FileWriter fw = new FileWriter(file);

            fw.write("Hello Students! This is Java class");

            fw.close();

            System.out.println("Content written on the file");
        } 
        catch (Exception e) {
            System.out.println(e);
        }

        // Reading from file
        try (FileReader fr = new FileReader(file)) {

            int i;

            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
```
