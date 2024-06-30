import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long n = Long.parseLong(br.readLine());
        long range = 1;
        long count = 1;

        while(range < n){
            range += 6 *count;
            count++;
        }

        bw.write(count + "");

        bw.flush();
        bw.close();
        br.close();
        
    }
}