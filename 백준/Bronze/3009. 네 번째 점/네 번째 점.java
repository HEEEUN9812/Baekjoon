import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Integer[] x = new Integer[3];
        Integer[] y = new Integer[3];
        
        for(int i = 0; i < 3; i++){
            st = new StringTokenizer(br.readLine(), " ");
            x[i] = Integer.parseInt(st.nextToken());
            y[i] = Integer.parseInt(st.nextToken());
        }

        if(x[0].equals(x[1])){
            bw.write(x[2] + " ");
        }else if(x[1].equals(x[2])){
            bw.write(x[0] + " ");
        }else{
            bw.write(x[1] + " ");
        }

        if(y[0].equals(y[1])){
            bw.write(y[2] + "");
        }else if(y[1].equals(y[2])){
            bw.write(y[0] + "");
        }else{
            bw.write(y[1] + "");
        }
        
        bw.flush();
        bw.close();
        br.close();
    }
}