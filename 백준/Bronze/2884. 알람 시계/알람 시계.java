import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String [] arr = br.readLine().split(" ");

        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);
        
        if(m - 45 < 0){
            m += 15;
            if(h > 0) {
                h -= 1;
            }else{
                h = 23;
            }
        }else{
            m -= 45;
        }
        
        bw.write(h + " " + m + "\n");

        bw.flush();
        bw.close();
    }
}