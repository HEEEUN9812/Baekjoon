import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        
        Integer[] students = new Integer[30];

        for(int i = 0; i < 30; i++){
            students[i] = 0;
        }

        for(int i = 0; i < 28; i++){
            st = new StringTokenizer(br.readLine());
            int clear = Integer.parseInt(st.nextToken());
            students[clear-1] = 1;
        }

        for(int i = 0; i < 30; i++){
            if(students[i] == 0){
                bw.write(i+1 + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}