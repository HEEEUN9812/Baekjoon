import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        List<Double> score = new ArrayList<>();
        
        st = new StringTokenizer(br.readLine() + " ");
        for(int i = 0; i < n; i++){
            score.add(Double.parseDouble(st.nextToken()));
        }
        
        Double max = Collections.max(score);
        Double sum = 0d;

        for(int i = 0; i < n; i++){
            sum += score.get(i) / max * 100;
        }
        
        bw.write(sum / n + "\n");
        
        bw.flush();
        bw.close();
    }
}