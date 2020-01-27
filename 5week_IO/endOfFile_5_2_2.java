import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        convert(System.in, System.out);
    }

     private static void convert(InputStream inputStream, OutputStream outputStream) throws IOException {
         int prev = inputStream.read();
         int cur;
         while (prev != -1) {
             cur = inputStream.read();
             if (!(prev == 13 && cur == 10)) {
                 outputStream.write(prev);
             }
             prev = cur;
         }
         outputStream.flush();
     }
}
