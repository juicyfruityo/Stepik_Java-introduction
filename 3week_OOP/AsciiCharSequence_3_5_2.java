import java.lang.CharSequence;
import java.lang.StringBuilder;

public class AsciiCharSequence_3_5_2 {
    public static void main(String[] args) {

          byte[] example = {72, 101, 108, 108, 111, 33};
          AsciiCharSequence answer = new AsciiCharSequence(example);
          System.out.println("Последовательность - " + answer.toString());//Hello!
          System.out.println("Размер её - " + answer.length());//6
          System.out.println("Символ под № 1 - " + answer.charAt(1));//e
          System.out.println("Подпоследовательность - " + answer.subSequence(1, 5));//ello
          //проверка на нарушение инкапсуляции private поля
          System.out.println(answer.toString());//Hello!
          example[0] = 74;
          System.out.println(answer.toString());//Hello!
    }

}

class AsciiCharSequence implements CharSequence {

    private byte[] sequence;

    public AsciiCharSequence(byte[] sequence) {
        this.sequence = sequence;
    }

    @Override
    public int length() {
        return sequence.length;
    }

    @Override
    public char charAt(int index) {
        return (char)sequence[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] res = new byte[end-start];
        for (int i=start; i<end; ++i) {
              res[i-start] = sequence[i];
        }
        return new AsciiCharSequence(res);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder(this.length());
        for(int i=0; i<this.length(); ++i){
            result.append((char)sequence[i]);
        }
        return result.toString();
    }
}
