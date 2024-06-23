import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine() + " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        List<String> basket = new ArrayList<>();
        Stack<String> stack = new Stack<>();

        for(int i = 0; i < n; i++){
            basket.add(i+1 + "");
        }

        for(int i = 0; i < m; i++){
            st = new StringTokenizer(br.readLine() + " ");
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for(int j = start - 1; j < end; j++){
                stack.push(basket.get(j));
            }
            for(int j = start -1; j < end; j++){
                basket.set(j, stack.pop());
            }
        }

        for(int i = 0; i < n; i++){
            bw.write(basket.get(i) + " ");
        }
        
        bw.flush();
        bw.close();
    }
}