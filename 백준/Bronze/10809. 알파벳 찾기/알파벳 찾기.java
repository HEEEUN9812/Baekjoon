import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int length = s.length();
        Integer[] arr = new Integer[26];
        
        for(int i = 0; i < 26; i++){
            arr[i] = -1;
        }

        for(int i = 0; i < length; i++){
            if(arr[(int)s.charAt(i) - 97] == -1){
                arr[(int)s.charAt(i) - 97] = i;   
            }
        }

        for(int i = 0; i < 26; i++){
            bw.write(arr[i] + " ");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}