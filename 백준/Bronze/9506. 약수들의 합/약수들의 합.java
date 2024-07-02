import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){
            int n = Integer.parseInt(br.readLine());
            if(n != -1){
            List<Integer> arr = new ArrayList<>();
            int result = 0;

            for(int i = 1; i <= n; i++){
                if(n % i == 0){
                    arr.add(i);
                    result += i;
                }
            }

            if((result-n) == n){
                bw.write(n + " = ");
                for(int i = 0; i < arr.size()-2; i++){
                    bw.write(arr.get(i) + " + ");
                }
                bw.write(arr.get(arr.size()-2) + "\n");
            }else{
                bw.write(n + " is NOT perfect." + "\n");
            }
            }else{
                break;
            }
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}