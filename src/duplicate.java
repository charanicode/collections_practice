import java.util.HashMap;

public class duplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1};
        HashMap<Integer,Integer> hashmap=new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int current=arr[i];
            if(hashmap.containsKey(current)){
                int count=hashmap.get(current);
                hashmap.put(current,count+1);
            }
            else{
                hashmap.put(current,1);
            }
        }
        boolean found=false;
        for (int i: hashmap.values()) {
            if(i>1){
                found=true;
                break;
            }
        }
        if (found){
            System.out.println("duplicates are there");
        }
        else{
            System.out.println("no duplicates");
        }
    }
}
