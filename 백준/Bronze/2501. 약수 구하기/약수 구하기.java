import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> arr = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                arr.add(i);
            }
        }

        if(arr.size() < k){
            bw.write(0 + "");
        }else{
            bw.write(arr.get(k-1) + "");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}