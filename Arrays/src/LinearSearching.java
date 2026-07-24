public class LinearSearching {
    public static void main(String[] args) {
   int[] nums = { 3,5,1,4,7,8,-3,4,67,99,12};
   int target = -3;
   int ans = linearsesarch(nums,target);
        System.out.println(ans);
    }
    // search in the array: return the  index if item found
    //otherwise if item not found return -1
    static int linearsesarch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length ; index++) {
            int element = arr[index];
            if(element == target){
                return index;
            }
        }
        return -1;

    }
}
