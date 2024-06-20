import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine()," ");
        Integer [] nums = new Integer[n];

        StringTokenizer st3 = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(st3.nextToken());

        int result = 0;
        
        for(int i = 0; i < n; i++){
            if(Integer.parseInt(st2.nextToken()) == num){
                result++;
            };
        }

        bw.write(result + "\n");
        
        
        bw.flush();
        bw.close();
    }
}