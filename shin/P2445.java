import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());

        if (n == 1) {
            bw.write("**");
        } else {

            for (int i = 1; i <= n; i++) {
                for (int j = 0; j < i; j++) {
                    bw.write("*");
                }
                for (int j = i; j < 2 * n - i; j++) {
                    bw.write(" ");
                }
                for (int j = 0; j < i; j++) {
                    bw.write("*");
                }
                bw.newLine();
            }

            for (int i = n - 1; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    bw.write("*");
                }
                for (int j = i; j < 2 * n - i; j++) {
                    bw.write(" ");
                }
                for (int j = 0; j < i; j++) {
                    bw.write("*");
                }
                if(i==1){
                    break;
                }
                bw.newLine();
            }
        }

        bw.close();
    }
}