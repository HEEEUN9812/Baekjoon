import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr =  br.readLine().split(" ");
        int result = 0;

        if(arr.length == 0){
            bw.write(0 + "\n");
        }else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i] != ""){
                    result++;
                }
            }
            bw.write(result + "\n");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}