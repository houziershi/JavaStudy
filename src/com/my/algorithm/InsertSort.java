package com.my.algorithm;

public class InsertSort {
    public void insertSort(int[] A) {
        for (int i = 1; i < A.length; i++) {
            int s = i - 1;
            int x = A[i];
            while (s >= 0 && x < A[s]) {
                A[s + 1] = A[s];
                s--;
            }
            A[++s] = x;
        }
    }

    public void test(String str) {
        if (str == null) throw new NullPointerException("str is null");

        System.out.println(str);
    }

    public static void main(String[] args) {
        System.out.println("main start");
        int[] A = new int[]{
                1, 9, 5, 45, 0, -1, 58, 96
        };//1, 9, 5, 45, 0, -1, 58, 96

        InsertSort insertSort = new InsertSort();

        insertSort.test("guokun");

        insertSort.insertSort(A);
        System.out.println("main end");
//        new Exception("hello").printStackTrace();
    }
}
