import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int total = 0;
        
        for(int i = 0; i < n; i++){
            String [] arr = br.readLine().split(" ");
            int a = Integer.parseInt(arr[0]);
            int b = Integer.parseInt(arr[1]);
            total += a*b;
        }
        
        if(total == x){
            bw.write("Yes" + "\n");
        }else{
            bw.write("No" + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}