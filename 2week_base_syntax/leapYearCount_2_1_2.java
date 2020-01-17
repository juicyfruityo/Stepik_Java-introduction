public class leapYearCount_2_1_2 {
    public static void main(String[] args) {
        System.out.print(leapYearCount(100));
    }

    public static int leapYearCount(int year) {
        int answer = 0;
        for (int i=1; i<=year; i++) {
            if ((i % 4 == 0) && (i % 100 != 0)) {
                answer++;
            }
            else if (i % 400 == 0) {
                answer++;
            }
        }
        return answer;
    }
}
