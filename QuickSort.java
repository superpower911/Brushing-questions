/**
 * @author Zonda
 * @version 1.0
 * @description 快排算法 详情见：BV117411x72U
 * @2024/8/29 9:42
 */
public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {32,4,5,56,67,67,6,2};
        quicksort(arr,0,arr.length-1);
        for(int i:arr){
            System.out.println(i);
        }
    }
    public static void quicksort(int[] arr,int left,int right){
        if(arr == null || arr.length == 0) return;
        if(left > right) return;
        int key = arr[left];
        int l = left;
        int r = right;
        while(l < r){
            while(arr[r] >= key && r > l){
                r--;
            }
            while(arr[l] <= key && r > l){
                l++;
            }
            if(l < r){
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
            }
        }
        arr[left] = arr[l];
        arr[l] = key;
        quicksort(arr,left,l-1);
        quicksort(arr, l+1, right);
    }
}