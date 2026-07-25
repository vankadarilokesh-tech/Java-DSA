public class Binarysearch {
    public static void main(String[] args) {
        int[] arr = {-3, -4, 0, 5, 6, 7, 8, 45, 56,97};
        int target = 45;
        int ans =binarysearch(arr , target);
        System.out.println(ans);
    }

    //return index
    //return -1 if it does not exist
    static int binarysearch(int[] arr , int target){

        int start = 0;
        int end = arr.length - 1;
        while(start <= end) {
            // find the middle
            // int mid = (start+end)/2 //might be possible that (start+end) exceeds range of the integer
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                // return ans
                return mid;
            }

        }
        return -1;
    }
}
