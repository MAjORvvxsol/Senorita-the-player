package filedemo;
import java.io*;
public class FileDemo
{
	File file = new File ("Reactangle.java");
System.out.println("File Exist....>"+file.length());
System.out.println("Length of File"+file.length());
System.out.println("Can file read"+file.canRead());
System.out.println("can file write>"+file.canWrite());
System.out.println("Wheather file is File>"+file.isFile());
System.out.println("File Absolute path>"+file.getAbsolute());
try{
    FileWriter fw;
    fw = new FileWriter(file);
    fe.write("Hello Students!This is java class");
    fw.close();
    System.out.println("Content written on the file");
}
catch(Expectation e)(
    System.out.println(e);
}
try (FileReader fr = new FileReader("C:\vs code\.vscode"))
int i;
while((i=fr.read())!=-1){
    System.out.print((char)i);

} catch (exception e){
    system.out.println(e);
}