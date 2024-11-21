import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class ExceptionFiles{
  public static void main(String[] args)throws IOException{
    Scanner in = new Scanner(System.in);
    boolean checkFile = false;
    String filename = " ";
    System.out.println("Enter a filename: ");
    while(checkFile == false){
    try{
    filename = in.nextLine();
    Scanner fin = new Scanner(new File(filename));
    break;
    }
    catch(FileNotFoundException e){
      System.out.print("File not found. Enter a filename: ");
      continue;
    }
     }
    Scanner fin = new Scanner(new File(filename));
    ArrayList<Integer> list = new ArrayList<Integer>();
    boolean checkInt = true;
    String error = " ";
    try{
    while(fin.hasNextLine() && checkInt == true){
      list.add(fin.nextInt());
    }
    }
    catch(InputMismatchException e){
      error = fin.nextLine();
      System.out.println(error + " was skipped");
      checkInt = true;
    }
    System.out.println(list);
    // FileWriter fout = new FileWriter("output.txt");
    // fout.write();
    // fout.write("\n");
    // fout.close();
  }
}