import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        int result = 0;
        
        for(int i = m; i <= n; i++){
            int a = 0;
            for(int j = 1; j <= i; j++){
                if(i % j == 0){
                    a++;
                }
            }
            if(a == 2){
                arr.add(i);
                result += i;
            }
        }

        if(arr.isEmpty()){
            bw.write(-1 + "");
        }else{
            bw.write(result + "\n");
            bw.write(arr.get(0) + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}