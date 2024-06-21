import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine()+" ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Integer[] basket = new Integer[n];

        for(int i = 0; i < n; i++){
            basket[i] = 0;
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine()+" ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            int ball = Integer.parseInt(st.nextToken());

            for(int j = start-1; j < end; j++){
                basket[j] = ball;
            }
            
        }

        for(int i = 0; i < n; i++){
            bw.write(basket[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}