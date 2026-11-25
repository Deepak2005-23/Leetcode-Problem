
public class MinimumDeletions {

    public static void main(String[] args) {

        int[] nums = {2, 10, 7, 5, 4, 1, 8, 6};
        int n = nums.length;

        int min = nums[0];
        int minIndex = 0;

        int max = nums[0];
        int maxIndex = 0;

        // Find minimum
        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minIndex = i;
            }
        }

        // Find maximum
        for (int j = 0; j < n; j++) {
            if (nums[j] > max) {
                max = nums[j];
                maxIndex = j;
            }
        }

        int leftIndex = Math.min(minIndex, maxIndex);
        int rightIndex = Math.max(minIndex, maxIndex);

        // Three possibilities
        int option1 = rightIndex + 1;
        int option2 = n - leftIndex;
        int option3 = (leftIndex + 1) + (n - rightIndex);

        int ans = Math.min(option1,
                  Math.min(option2, option3));

        System.out.println("Minimum: " + min);
        System.out.println("Minimum Index: " + minIndex);

        System.out.println("Maximum: " + max);
        System.out.println("Maximum Index: " + maxIndex);

        System.out.println("Option 1: " + option1);
        System.out.println("Option 2: " + option2);
        System.out.println("Option 3: " + option3);

        System.out.println("Minimum Deletions: " + ans);
    }
}
