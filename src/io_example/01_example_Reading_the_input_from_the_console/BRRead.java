import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRRead {

    public static void main(String[] args) throws IOException {
        char c;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string");
        do {
            c = (char) bufferedReader.read();
            System.out.print(c);
        } while (c != 'q');
    }

}
