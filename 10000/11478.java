import java.io.IOException;
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException{
      Scanner sc = new Scanner(System.in);
      String str=sc.nextLine();
      HashSet<String> hs=new HashSet<>();

      for(int i=0;i<str.length();i++)
        for(int j=i+1;j<=str.length();j++){
          hs.add(str.substring(i,j));
        }

      System.out.println(hs.size());
    }
}
