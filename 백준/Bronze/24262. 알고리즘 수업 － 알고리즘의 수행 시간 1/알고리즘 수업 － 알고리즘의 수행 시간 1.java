import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        bw.write("1" + "\n");
        bw.write("0");

        bw.flush();
        bw.close();
    }
}