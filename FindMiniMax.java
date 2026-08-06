package dsa1.array;

import java.util.ArrayList;

public class FindMiniMax {

    public static ArrayList<Integer> findMiniMax(int[] arr) {

        int mini = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num < mini)
                mini = num;

            if (num > max)
                max = num;
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(mini);
        res.add(max);

        return res;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        ArrayList<Integer> res = findMiniMax(arr);

        System.out.println("Minimum Element: " + res.get(0));
        System.out.println("Maximum Element: " + res.get(1));
    }
}