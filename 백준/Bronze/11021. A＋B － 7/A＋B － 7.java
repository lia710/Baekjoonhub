import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(bf.readLine());
        StringTokenizer st;
        for(int i = 0; i<T; i++){
            st = new StringTokenizer(bf.readLine());
            bw.write("Case #" + (i+1) + ": ");
            bw.write((Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())) +"\n");
        }
        bw.close();
    }
}