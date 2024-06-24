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
            bw.write(Character.toString(S.charAt(0)) + Character.toString(S.charAt(length-1)) + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}