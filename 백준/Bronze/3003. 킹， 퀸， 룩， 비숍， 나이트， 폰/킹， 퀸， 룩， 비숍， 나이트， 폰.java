import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        Integer[] arr = new Integer[6];
        for(int i = 0; i < 6; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int n = 0; n < 6; n++){
        
            switch(n) {
                case 0:
                    arr[n] = 1 - arr[n];
                    break;

                case 1:
                    arr[n] = 1 - arr[n];
                    break;

                case 2:
                    arr[n] = 2 - arr[n];
                    break;

                case 3:
                    arr[n] = 2 - arr[n];
                    break;

                case 4:    
                    arr[n] = 2 - arr[n];
                    break;

                case 5:
                    arr[n] = 8 - arr[n];
                    break;
                
              }
        }

        for(int i = 0; i < 6; i++){
            bw.write(arr[i] + " ");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}