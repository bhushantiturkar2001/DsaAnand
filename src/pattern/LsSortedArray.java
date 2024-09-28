package pattern;

public class LsSortedArray {
    public static void main(String[] args) {
        int arr[] = {-1,2,3,4,7,8};
        boolean res = lsForSortedArray(arr,6,99);
        System.out.println(res);
    }

    private static boolean lsForSortedArray(int[] arr, int n, int key) {
        for(int i = 0; i<n; i++){
            if(arr[i] == key)
                return true;
            if(arr[i] > key)
                return false;
        }
        System.out.println("Key not found");
        return false;

    }

}
