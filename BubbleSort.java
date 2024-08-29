/**
 * @author Zonda
 * @version 1.0
 * @description 冒泡排序算法
 * 1.每次排序都是把遍历过的所有元素的最大值放到最后
 * 2.所以外层循环遍历到 i < arr.length，内层循环遍历到 j < arr.length - i - 1
 * @2024/8/29 9:54
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {32,4,5,56,67,67,6,2};
        Bubble(arr);
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void Bubble(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}