package pattern;

public class FindMax {
    public static void main(String[] args) {
        int[] arr = {5,7,1,2,3};
        int max = findMax(arr,5);
        System.out.println(max);
    }

    private static int findMax(int[] arr, int n){
        int max = arr[0];
        for(int i = 0; i<n; i++){
            if(max<arr[i])
                max=arr[i];
        }
        return max;
    }

}
