package FirstSession;

import java.util.*;

public class DailyTemp {

    public int[] dailyTemperatures(int[] temperatures) {

        int n = temperatures.length;
        int[] res = new int[n];

        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < n; i++) {

            while(!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {

                int index = stack.pop();
                res[index] = i - index;
            }

            stack.push(i);
        }

        return res;
    }

    public static void main(String[] args) {

        int[] temp = {73,74,75,72,73,74,76};

        DailyTemp obj = new DailyTemp();

        int[] ans = obj.dailyTemperatures(temp);

        System.out.println(Arrays.toString(ans));
    }
}