import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st1.nextToken());
        int x = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        String result = "";
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(st2.nextToken());
            if(a < x){
                result += a + " ";
            }
        }
        result.substring(0,result.length()-1);
        bw.write(result + "\n");

        bw.flush();
        bw.close();
        
    }
}