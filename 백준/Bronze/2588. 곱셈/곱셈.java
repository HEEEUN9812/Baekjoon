import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = bf.readLine();
        String b = bf.readLine();

        int result1 = Integer.parseInt(a) * (b.charAt(2) - '0');
        int result2 = Integer.parseInt(a) * (b.charAt(1) - '0');
        int result3 = Integer.parseInt(a) * (b.charAt(0) - '0');
        int result4 = result1 + result2 * 10 + result3 * 100;

        bw.write(result1 + " " + "\n");
        bw.write(result2 + " " + "\n");
        bw.write(result3 + " " + "\n");
        bw.write(result4 + " " + "\n");
        bw.flush();
        bw.close();
    }
}