import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException{
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      // StringTokenizer st = new StringTokenizer(br.readLine());
      HashMap<String, Double> hm = new HashMap<>(){{
        put("A+", 4.5);
        put("A0", 4.0);
        put("B+", 3.5);
        put("B0", 3.0);
        put("C+", 2.5);
        put("C0", 2.0);
        put("D+", 1.5);
        put("D0", 1.0);
        put("F", 0.0);
        put("P", 0.0);
      }};

      Double res=0.0;
      Double total=0.0;
      for(int i=0;i<20;i++){
        StringTokenizer st=new StringTokenizer(br.readLine());
        String str=st.nextToken();
        Double grade=Double.parseDouble(st.nextToken());
        String rate=st.nextToken();

        if(!rate.equals("P")){
          total+=grade;
        }
        res+=grade*hm.get(rate);
      }

      System.out.printf("%.6f\n",res/total);
    }
}
