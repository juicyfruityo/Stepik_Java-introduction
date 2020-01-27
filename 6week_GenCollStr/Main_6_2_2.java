import java.util.*;

public class Main_6_2_2 {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        List<Integer> arr = new ArrayList<Integer>();
        Integer n;
        int i=0;

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext() == true) {
            n = sc.nextInt();
            if (i % 2 != 0)
                arr.add(n);
            i++;
        }

        for (int j=arr.size()-1; j>=0; --j) {
            System.out.print(arr.get(j).toString() + " ");
        }
        System.out.flush();
    }
}
