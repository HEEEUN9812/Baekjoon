import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int result = 0;

        for(int i = 0; i < n; i++){
            result += Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}