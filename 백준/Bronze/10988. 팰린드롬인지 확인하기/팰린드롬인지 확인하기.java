import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int length = str.length();
        int result = 0;

        if(length == 1){
            result = 1;
        }else{
            for(int i = 0; i < length/2; i++){
                if(str.charAt(i) == str.charAt(length-1-i)){
                    result = 1;
                }else{
                    result = 0;
                    break;
                }
            }
        }
        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}