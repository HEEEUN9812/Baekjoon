import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;

        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(st.nextToken());
            int k = 0;
            for(int j = 1; j <= a; j++){
                if(a % j == 0){
                    k++;
                }    
            }
            if(k == 2){
                result++;
            }
        }

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}