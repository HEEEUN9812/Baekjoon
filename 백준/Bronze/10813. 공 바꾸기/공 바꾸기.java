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
            basket[i] = i + 1;
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine()+" ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int temp = basket[a-1];
            basket[a-1] = basket[b-1];
            basket[b-1] = temp;
        }

        for(int i = 0; i < n; i++){
            bw.write(basket[i] + " ");
        }

        bw.flush();
        bw.close();
    }
}