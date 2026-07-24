import java.util.Arrays;

public class CharacterArray {
    public static void main(String[] args) {
        String name = "lokesh";
        char target = 'L';
        System.out.println(search(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }
    //toCharArray()
    static boolean search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for(char ch:str.toCharArray()){
            if(ch == target){
                return true;
            }
        }
        return false;
    }
}
