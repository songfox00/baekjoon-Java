import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
      ArrayList<Integer> arr= new ArrayList<>();
      
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      StringTokenizer st=new StringTokenizer(br.readLine());

      int n=Integer.parseInt(st.nextToken());
      int m=Integer.parseInt(st.nextToken());

      for(int i=1;i<=n;i++){
        arr.add(i);
      }

      for(int i=0;i<m;i++){
        st=new StringTokenizer(br.readLine());

        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());

        int first=arr.get(a-1);
        arr.set(a-1,arr.get(b-1));
        arr.set(b-1,first);
      }

      for(int s:arr)
        System.out.print(s+" ");
    }
}
