import java.util.*;

public class QuickSort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] input = line.trim().split(" ");
        int[] nums = new int[input.length];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }

        sort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));

        scanner.close();
    }

    static void sort(int[] nums, int low, int high) {
        if (high > low) {
            int pivotIndex = partition(nums, low, high);
            sort(nums, low, pivotIndex-1);
            sort(nums, pivotIndex+1, high);
        }
    }

    static int partition(int[] nums, int low, int high) {
        int pivot = nums[high];

        int x = low - 1;
        for (int i = low; i <= high; i++) {
            if (nums[i] <= pivot) {
                x++;
                if (i > x) {
                    int tmp = nums[i];
                    nums[i] = nums[x];
                    nums[x] = tmp;
                }
            }
        }
        
        return x;
    }
}