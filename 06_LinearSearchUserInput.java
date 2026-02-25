import java.util.Scanner;

public class LinearSearchUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();

        int key = sc.nextInt();
        int pos = -1;

        for (int i = 0; i < n; i++)
            if (arr[i] == key) pos = i;

        System.out.println(pos);
    }
}
