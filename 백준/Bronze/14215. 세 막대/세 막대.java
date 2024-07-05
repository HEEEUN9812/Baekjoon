import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int[] arr = new int[3];
        
        for(int i = 0; i < 3 ; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        if(arr[2] < arr[0] + arr[1]){
            bw.write(arr[0] + arr[1] + arr[2] + "");
        }else{
            arr[2] = arr[0] + arr[1] - 1;
            bw.write(arr[0] + arr[1] + arr[2] + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}