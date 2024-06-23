import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        Set<Integer> set = new HashSet<Integer>();

        for(int i = 0; i < 10; i++){
            st = new StringTokenizer(br.readLine());
            set.add(Integer.parseInt(st.nextToken()) % 42);
            }
        
        bw.write(set.size() + "\n");

        bw.flush();
        bw.close();
    }
}