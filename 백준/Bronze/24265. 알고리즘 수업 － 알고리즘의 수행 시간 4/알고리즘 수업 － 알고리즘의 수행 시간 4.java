import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long result = 0;

        for(int i = n-1; i > 0; i--){
            result += i;
        }
        bw.write(result + "\n" + "2");

        bw.flush();
        bw.close();
        br.close();
    }
}