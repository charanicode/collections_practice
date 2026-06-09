import java.util.HashMap;
import java.util.Map;

public class most_frequent {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 3, 4, 3, 5};
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int num:arr){
            if(hashMap.containsKey(num)){
                int count= hashMap.get(num);
                hashMap.put(num,count+1);
            }
            else{
                hashMap.put(num,1);
            }
        }
        int largest=0;
        for (int i = 0; i < arr.length; i++) {
            int num=arr[i];
            int result=hashMap.get(num);
            if (result>largest){
                largest=result;
            }
        }
        for (HashMap.Entry<Integer,Integer>hash: hashMap.entrySet()) {
            if(hash.getValue() == largest){
                System.out.println(hash.getKey());
            }
        }

    }
}
