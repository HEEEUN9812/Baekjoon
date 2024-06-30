import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        if(a > v){
            bw.write(1 + "");
        }else{
            if((v-a) % (a-b) == 0){
                bw.write((v-a) / (a-b) + 1 + "");
            }else if((v-a) % (a-b) != 0){
                bw.write((v-a) / (a-b) + 2 + "");
            }
        }

        bw.flush();
        bw.close();
        br.close();
        
    }
}