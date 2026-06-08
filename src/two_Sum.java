import java.util.HashMap;

public class two_Sum {
    public static void main(String[] args) {
        int[] arr = {2, 11, 7, 15};
        int target = 9;
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int current=arr[i];
            int calculate=target-current;
            if(hashmap.containsKey(calculate)){
                System.out.println(hashmap.get(calculate));
                System.out.println(i);
            }
            else{
                hashmap.put(current,i);
            }
        }
    }
}
