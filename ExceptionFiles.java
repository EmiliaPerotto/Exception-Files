import java.util.*;
import java.io.*;
import java.util.ArrayList;
public class ExceptionFiles{
  public static void main(String[] args)throws IOException{
    Scanner in = new Scanner(System.in);
    boolean checkFile = false;
    String filename = " ";
    System.out.println("Enter a filename: ");
    while(true){
    try{
    filename = in.nextLine();
    Scanner fin = new Scanner(new File(filename));
    break;
    }
    catch(Exception e){
      System.out.print("File not found. Enter a filename: ");
      continue;
    }
     }
    Scanner fin = new Scanner(new File(filename));
    ArrayList<Integer> arr = new ArrayList<Integer>();
    int empty = 0;
    double mean = 0.0;
    try{
    while(fin.hasNextLine()){
      empty = fin.nextInt();
      arr.add(empty);
      mean = mean + empty;
    }
    }
    catch(InputMismatchException e){
      System.out.println(fin.nextLine() + " was skipped");
    }

    FileWriter fout = new FileWriter("output.txt");
    Collections.sort(arr);
    double median = 0.0;
    mean = mean / arr.size();
    String smean = String.format("Mean : %.3f", mean);
    fout.write(smean + "\n");
    if(arr.size()%2==0){
      median = (arr.get((arr.size() - 1)/2) + arr.get(((arr.size()-1)/2)+1)) /2;
    }
    else{
      median = arr.get((arr.size()-1)/2);
    }
    String smed = String.format("Median : %.1f", median);
    fout.write(smed + "\n");
    fout.write("Max " + arr.get(0) + "\n");
    fout.write("Min " + arr.get(arr.size()-1) + "\n");
    // fout.close();
  }
}