import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().toUpperCase();
        Integer[] count = new Integer[26];
        int k = 0;
        int max = 0;
        int same = 0;

        for(int i = 0; i < 26; i++){
            count[i] = 0;
        }

        for(int i = 0; i < str.length(); i++){
            count[(int)str.charAt(i) - 65] += 1;
        }
        
        for(int i = 0; i < 26; i++){
            if(count[i] > k){
                k = count[i];
                max = i;
            }
        }

        for(int i = 0; i < 26; i++){
            if(count[i] == k){
                same++;
            }
        }

        if(same == 1){
            bw.write((char)(max+65) + "\n");
        }else{
            bw.write("?" + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}