public class BinarySearchDescending {
    public static void main(String[] args) {
        int[] arr = {99, 87, 67, 56, 45, 34, 23, 12, 3, 2, 0}; // mid = 34
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
            if (target > arr[mid]) {
                end = mid - 1;
            } else if (target < arr[mid]) {
                start = mid + 1;
            } else {
                // return ans
                return mid;
            }

        }
        return -1;
    }
}
