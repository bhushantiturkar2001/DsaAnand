package pattern;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {5,-1,7,8,2,3};
        boolean res = ls(arr,6,3);
        System.out.println(res);


    }

    private static boolean ls(int[] arr, int n, int key) {
        for(int i = 0; i<n; i++){
            if(arr[i]==key)
                return true;
        }
        System.out.println("Key not found");
        return false;
    }
}
