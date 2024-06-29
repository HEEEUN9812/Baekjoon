import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        for(int i = 0; i < t; i++){
            int c = Integer.parseInt(br.readLine());
            bw.write(c / 25 + " ");
            bw.write((c % 25) / 10 + " ");
            bw.write(((c % 25) % 10) / 5 + " ");
            bw.write(((c % 25) % 10) % 5 + "\n");
            
        }
        
        bw.flush();
        bw.close();
        br.close();
        
    }
}