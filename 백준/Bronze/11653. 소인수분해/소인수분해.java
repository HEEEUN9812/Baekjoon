import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();

        if(n == 1){
            bw.write("");
        }else{
        while(true){
            for(int i = 2; i <= n; i++){
                if(n % i == 0){
                    arr.add(i);
                    n /= i;
                    break;
                }
            }
            if(n < 2){
                break;
            }
        }

        for(int i = 0; i < arr.size(); i++){
            bw.write(arr.get(i) + "\n");
        }
        }
        

        bw.flush();
        bw.close();
        br.close();
    }
}