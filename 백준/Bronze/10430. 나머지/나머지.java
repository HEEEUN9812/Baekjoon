import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String [] arr = bf.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        
        bw.write((a+b)%c + "\n");
        bw.write(((a%c)+(b%c))%c + "\n");
        bw.write((a*b)%c + "\n");
        bw.write(((a%c)*(b%c))%c + "\n");
        bw.flush();
        bw.close();
    }
}