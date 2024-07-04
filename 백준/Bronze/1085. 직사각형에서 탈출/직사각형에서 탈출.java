import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int a = 0;
        int b = 0;

        if(x < w - x){
            a = x;
        }else{
            a = w - x;
        }

        if(y < h - y){
            b = y;
        }else{
            b = h - y;
        }

        if(a < b){
            bw.write(a + "");
        }else{
            bw.write(b + "");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}