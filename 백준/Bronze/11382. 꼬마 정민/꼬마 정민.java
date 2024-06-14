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
        long a = Long.parseLong(arr[0]);
        long b = Long.parseLong(arr[1]);
        long c = Long.parseLong(arr[2]);
        long result = a + b + c;

        bw.write(result + " " + "\n");
        bw.flush();
        bw.close();
    }
}