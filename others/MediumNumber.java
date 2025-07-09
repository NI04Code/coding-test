import java.util.*;

public class MediumNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < inputNumber; i++) {
            String line = scanner.nextLine();
            String[] input = line.trim().split(" ");
            int[] nums = new int[input.length];

            for (int j = 0; j < nums.length; j++) {
                nums[j] = Integer.parseInt(input[j]);
            }

            QuickSort.sort(nums, 0, nums.length-1);

            System.out.println(nums[1]);
        }

        scanner.close();
    }
}
