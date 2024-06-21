import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int max = 0;
        int a = 0;
        int n = 0;
        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            if(max < a){
                max = a;
                n = i + 1;
            }
        }
        bw.write(max + "\n");
        bw.write(n + "\n");

        bw.flush();
        bw.close();
        
    }
}