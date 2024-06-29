import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        double result = 0;

        for(int i = 0; i < N.length(); i++){
            int a = 0;
            if((int)N.charAt(N.length()-1-i) > 64){
                a = (int)N.charAt(N.length()-1-i) - 55;
            }else{
                a = (int)N.charAt(N.length()-1-i) - 48;
            }
            result += Math.pow((double)B, (double)i) * a;
        }

        bw.write((int)result + "\n");

        bw.flush();
        bw.close();
        br.close();
        
    }
}