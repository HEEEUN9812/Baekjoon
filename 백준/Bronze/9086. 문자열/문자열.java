import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++){
            String S = br.readLine();
            int length = S.length();
            S = S.substring(0, 1) + S.substring(length-1, length);
            bw.write(S + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}