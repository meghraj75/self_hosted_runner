import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;





import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileHandling {
    public static void readFile()throws FileNotFoundException {
        FileReader fr = new FileReader("C:/Users/mohit/OneDrive/Desktop/hello.txt");

        BufferedReader fileinput=new BufferedReader(fr);
        //  throw new FileNotFoundException();
    }
    public static void main(String args[]){

        try{
            readFile();
        } catch(FileNotFoundException f){
            f.printStackTrace();
        }
        System.out.println("work properly");
    }

}

