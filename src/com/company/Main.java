package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 6, 1, 2,4, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        insertionSort(arr);
        System.out.println("After sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
    }

    public static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println("Bước " + i + ": ");
            System.out.println("Xét từ phần tử " + arr[i]);
            int x = arr[i];
            int pos = i;
            for (int j = i; j > 0; j--) {
                if (x < arr[j - 1]) {
                    arr[j] = arr[j - 1];
                    pos = j-1;
                }
            }
            arr[pos] = x;
            System.out.println("Kết thúc bước " + i + " ta được kết quả: ");
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j] + "\t");
            }
            System.out.println();
        }
    }
}

//        int pos, x;
//        for (int i = 1; i < arr.length; i++) { //đoạn array[0] đã sắp xếp
//            x = arr[i];
//            pos = i;
//            while (pos > 0 && x < arr[pos - 1]) {
//                arr[pos] = arr[pos - 1]; // đổi chỗ
//                pos--;
//            }
//            arr[pos] = x;
//        }
//int x, pos;