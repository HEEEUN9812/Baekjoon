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
        int time = Integer.parseInt(br.readLine());

        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        h += time / 60;
        m += time % 60;
        
        if(m >= 60){
            h += 1;
            m -= 60;
        }
        if(h > 23){
            h -= 24;
        }
        bw.write(h + " " + m + "\n");

        bw.flush();
        bw.close();
    }
}