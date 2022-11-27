package com.solution.boj.p_15596;

/**
 * 15596번 문제
 *
 * @Author: jsj0828
 **/
public class P_15596 {

    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5};
        Test test = new Test();
        long sum = test.sum(a);
        System.out.println(sum);
    }

    public static class Test {
        public long sum(int[] a) {
            long result = 0;
            for (int i = 0; i < a.length; i++) {
                result += a[i];
            }
            return result;
        }
    }
}
