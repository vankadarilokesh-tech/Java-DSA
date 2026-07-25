public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {-3, -4, 0, 5, 6, 7, 8, 45, 56,97};
                int target = 6;
        int ans = orderagnosticBS(arr , target);
        System.out.println(ans);
    }
    static int orderagnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end) {

            int mid = start + (end - start) / 2;
            if(target == arr[mid]) {
                return mid;
            }
            if(isAsc) {

                if (target < arr[mid]) {
                    end = mid - 1;
                } else  {
                    start = mid + 1;
                }
            }
             else {

                if (target > arr[mid]) {
                    end = mid - 1;
                } else {   //Descending
                    start = mid + 1;
                }
            }

        }
        return -1;

    }
}
