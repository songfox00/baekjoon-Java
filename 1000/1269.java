import java.io.IOException;
import java.util.Scanner;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException{
      Scanner sc=new Scanner(System.in);
      HashSet<Integer> s=new HashSet<>();

      int n=sc.nextInt();
      int m=sc.nextInt();

      for(int i=0;i<n+m;i++){
        int a=sc.nextInt();

        if(s.contains(a))
          s.remove(a);
        else
          s.add(a);
      }

      System.out.println(s.size());
    }
}
