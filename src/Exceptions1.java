import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) throws FileNotFoundException {

        // try/catch demo
        try{
            readFile();
            System.out.println("Text after SUCCESSFUL read file execution");
        }catch (FileNotFoundException e){
            System.out.println("Error description: ");
            System.out.println("File does not found"); // own error handling

            ///////////
//            e.printStackTrace();

//        Error description:
//        java.io.FileNotFoundException: asdfasdf (No such file or directory)
//        at java.base/java.io.FileInputStream.open0(Native Method)
//        at java.base/java.io.FileInputStream.open(FileInputStream.java:216)
//        at java.base/java.io.FileInputStream.<init>(FileInputStream.java:157)
//        at java.base/java.util.Scanner.<init>(Scanner.java:639)
//        at Exceptions1.main(Exceptions1.java:11)
//
//        Process finished with exit code 0
        }

        // now we can continue program without crash
        System.out.println("Usual continuation after possible error....");
    }


    public static void readFile() throws FileNotFoundException {  // we can warn program about possible exception
        File file = new File("asdfasdf"); // no file with such name
        Scanner scanner = new Scanner(file);
    }
}
