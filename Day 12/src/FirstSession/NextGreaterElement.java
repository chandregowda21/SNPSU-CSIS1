package FirstSession;

import java.util.*;

public class NextGreaterElement {

    public static int[] nextGreaterElements(int[] nums) {

        int n = nums.length;

        int[] result = new int[n];

        Arrays.fill(result, -1);

        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < 2 * n; i++) {

            int index = i % n;

            while (!deque.isEmpty() && nums[deque.peek()] < nums[index]) {

                int prevIndex = deque.pop();

                result[prevIndex] = nums[index];
            }

            if (i < n) {
                deque.push(index);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 1};

        int[] ans = nextGreaterElements(nums);

        System.out.println(Arrays.toString(ans));
    }
}