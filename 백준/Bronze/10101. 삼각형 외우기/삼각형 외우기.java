import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        if((a + b + c) != 180){
            bw.write("Error");
        }else{
            if(a == b && b == c && a == c){
                bw.write("Equilateral");
            }else{
                if(a == b || b == c || a == c){
                    bw.write("Isosceles");
                }else{
                    bw.write("Scalene");
                }
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}