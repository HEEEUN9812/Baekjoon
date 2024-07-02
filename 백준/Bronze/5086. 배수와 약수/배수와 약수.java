import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            if(a < b){
                if(b % a == 0){
                    bw.write("factor" + "\n");
                }else{
                    bw.write("neither" + "\n");
                }
            }else if(a > b){
                if(a % b ==0){
                    bw.write("multiple" + "\n");
                }else{
                    bw.write("neither" + "\n");
                }
            }else if( a == 0 && b == 0){
                break;
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}