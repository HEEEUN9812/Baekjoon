import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int a = 0;
        int b = 0;
        int max = 0;

        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine(), " ");
            for(int j = 0; j < 9; j++){
                int k = Integer.parseInt(st.nextToken());
                if(k > max){
                    a = i;
                    b = j;
                    max = k;
                }
            }
        }

        bw.write(max + "\n");
        bw.write(a+1 + " " + (b+1));

        bw.flush();
        bw.close();
        br.close();
    }
}