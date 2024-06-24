import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String S = br.readLine();
        Integer i = Integer.parseInt(br.readLine());

        bw.write(S.charAt(i-1) + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}