public class MaxRange {

        public static void main(String[] args) {
            int[] arr = { 1, 34, 56, 74,8};
            System.out.println(max(arr, 1,2));
        }
        static int max(int[] arr, int start ,int end){
            int max = arr[0];
            for (int i = start; i < end; i++) {
                if(arr[i] > max){
                    max = arr[i];
                }

            }
            return max;
        }
    }


