import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long k = 1;
        long result = 0;

        for(int i = n - 2; i > 0; i--){
            result += i * k;
            k++;
        }

        bw.write(result+ "\n" + "3");

        bw.flush();
        bw.close();
        br.close();
    }
}