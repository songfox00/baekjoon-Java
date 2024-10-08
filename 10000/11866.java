import java.io.IOException;
import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException{
      Queue<Integer> q=new LinkedList<>();
      Scanner sc=new Scanner(System.in);

      int n=sc.nextInt();
      int m=sc.nextInt();

      for(int i=1;i<=n;i++){
        q.add(i);
      }

      System.out.print("<");
      while(!q.isEmpty()){
        for(int i=0;i<m-1;i++){
          q.add(q.poll());
        }
        System.out.print(q.poll());
        
        if(q.size()>=1)
          System.out.print(", ");

      }
      System.out.print(">");
    }
}
