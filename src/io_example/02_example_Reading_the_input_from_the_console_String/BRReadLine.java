import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BRReadLine {
    private static String string;
    private static BufferedReader bufferedReader;

    public static void main(String[] args) {
        try {
            bufferedReader= new BufferedReader(new InputStreamReader(System.in));
            string =bufferedReader.readLine();
            System.out.println(string);
        }catch (IOException e){

        }finally {
            if(bufferedReader!=null){
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
