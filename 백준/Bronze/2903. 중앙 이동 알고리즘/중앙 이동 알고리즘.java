import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int a = 2;
        int result = 0;

        for(int i = 1; i <= n; i++){
            a = a + (a-1);
            result = a * a;
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
        
    }
}