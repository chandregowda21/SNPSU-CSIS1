import java.io.*;
public class MultievelDucking {
    static void readFile()throws IOException{
        FileReader fr = new FileReader("file.txt");
        System.out.println("file is opened successfully");
    }
    static void processFile()throws IOException{
        readFile();
    }
    static void handleFile()throws IOException{
        processFile();
    }
    public static void main(String[] args){
        try{
            handleFile();
        }
        catch (IOException e){
            System.out.println("caught exception in main");
        }
        finally {
            System.out.println("finally done brother");
        }
    }
}
