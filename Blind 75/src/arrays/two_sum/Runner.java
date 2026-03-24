package arrays.two_sum;

import arrays.two_sum.impl.BruteForce;
import arrays.two_sum.impl.HashMapApproach;

public class Runner {

    public static void main(String[] args) {

        int[] nums = {2, 7, 11, 15};
        int target = 9;

        BruteForce bf = new BruteForce();
        HashMapApproach hm = new HashMapApproach();

        int[] res1 = bf.solve(nums, target);
        int[] res2 = hm.solve(nums, target);

        System.out.println("BruteForce: " + res1[0] + " " + res1[1]);
        System.out.println("HashMap: " + res2[0] + " " + res2[1]);
    }
}