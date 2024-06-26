import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());
        
        num1 = num1 % 10 * 100 + num1 / 10 % 10 * 10 + num1 / 100 % 10;
        num2 = num2 % 10 * 100 + num2 / 10 % 10 * 10 + num2 / 100 % 10;

        if(num1 > num2){
            bw.write(num1 + "\n");
        }else{
            bw.write(num2 + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
