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
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);

        if(a == b && a == c){
            bw.write(10000 + a *1000 + "\n");
        }else if(a == b || a == c || b == c){
            if(a == b){
                bw.write(1000 + a * 100 + "\n");
            }else if(a == c){
                bw.write(1000 + a * 100 + "\n" );
            }else{
                bw.write(1000 + b * 100 + "\n");
            }
        }else{
            int max = 0;
            if(a - b > 0){
                max = a;
                if(c - a > 0){
                    max = c;
                }
            }else{
                max = b;
                if(c - b > 0){
                    max = c;
                }
            }
            bw.write(max * 100 + "\n");
        }

        bw.flush();
        bw.close();
    }
}