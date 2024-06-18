import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    

        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < n; i++){
            String star = "";

            for(int j = n - i; j > 1; j--){
                star += " ";
            }

            for(int k = 0; k < i+1; k++){
                star += "*";
            }
            bw.write(star + "\n");
        }

        bw.flush();
        bw.close();
    }
}