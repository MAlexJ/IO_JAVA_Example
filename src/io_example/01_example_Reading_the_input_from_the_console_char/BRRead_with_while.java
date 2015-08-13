import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead_with_while {
    private static char c;
    private static BufferedReader bufferedReader;

    public static void main(String[] args) {
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            while (c != 'q') {
                c = (char) bufferedReader.read();
                System.out.print(c);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
