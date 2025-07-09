import java.util.*;

public class BubbleSort {
    public static void main (String args[]) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] input = line.trim().split(" ");

        int[] nums = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j+1]) {
                    int tmp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(nums));

        scanner.close();

    }
}