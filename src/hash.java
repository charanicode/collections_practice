import java.util.HashMap;
import java.util.Map;

public class hash {
    public static void main(String[] args) {
        String str = "java python java sql java python";
        HashMap<String,Integer> hashmap=new HashMap<>();
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
        for (int i: hashmap.keySet()) {
            int num=hashmap.get(i);
            if(num>1){
                System.out.println(i);
                break;
            }
        }

//         int[] arr = {1, 2, 3, 1};
//        HashMap<Integer,Integer> hashmap=new HashMap<>();
//        for(int i = 0; i < arr.length; i++) {
//            int current=arr[i];
//            if(hashmap.containsKey(current)){
//                int count=hashmap.get(current);
//                hashmap.put(current,count+1);
//            }
//            else{
//                hashmap.put(current,1);
//            }
//        }
//        boolean found=false;
//        for (int i: hashmap.values()) {
//            if(i>1){
//                found=true;
//                break;
//            }
//        }
//        if (found){
//            System.out.println("duplicates are there");
//        }
//        else{
//            System.out.println("no duplicates");
//        }
//           int[] arr = {2, 11, 7, 15};
//        int target = 9;
//        HashMap<Integer,Integer> hashmap=new HashMap<>();
//        for(int i = 0; i < arr.length; i++) {
//            int current=arr[i];
//            int calculate=target-current;
//            if(hashmap.containsKey(calculate)){
//                System.out.println(hashmap.get(calculate));
//                System.out.println(i);
//            }
//            else{
//                hashmap.put(current,i);
//            }
//        }
//        int[] arr = {2, 2, 1, 2, 3, 2, 2};
//        HashMap<Integer,Integer> hashmap=new HashMap<>();
//        for (int i :arr) {
//            if (hashmap.containsKey(i)){
//                int count=hashmap.get(i);
//                hashmap.put(i,count+1);
//            }
//            else{
//                hashmap.put(i,1);
//            }
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            int number=arr[i];
//            int len=arr.length/2;
//            if(hashmap.get(number)>len){
//                System.out.println(number);
//                break;
//            }
//        }
//         int[] arr = {1, 2, 3, 2, 1, 4, 5};
//        HashMap<Integer,Integer> hashmap=new HashMap<>();
//        for (int i :arr) {
//            if (hashmap.containsKey(i)){
//                int count=hashmap.get(i);
//                hashmap.put(i,count+1);
//            }
//            else{
//                hashmap.put(i,1);
//            }
//        }
//        for (int i = 0; i <arr.length ; i++) {
//            int number=arr[i];
//            if(hashmap.get(number)==1){
//                System.out.println(number);
//                break;
//            }
//        }
//        HashMap<Character,Integer> hashmap=new HashMap<>();
//        String str = "swiss";
//        for (int i = 0; i < str.length(); i++) {
//           char ch=str.charAt(i);
//            if(hashmap.containsKey(ch)){
//                int count=hashmap.get(ch);
//                hashmap.put(ch,count+1);
//            }
//            else{
//                hashmap.put(ch,1);
//            }
//        }
//        for (int i=0;i<str.length();i++) {
//            char ch=str.charAt(i);
//            if(hashmap.get(ch)==1){
//                System.out.println(ch);
//                break;
//            }
//        }
//        int[] arr = {1, 2, 1, 3, 2, 1};
//        HashMap<Integer,Integer>hash=new HashMap<>();
//        for (int i:arr) {
//            if(hash.containsKey(i)){
//                int count=hash.get(i);
//                hash.put(i,count+1);
//            }
//            else{
//                hash.put(i,1);
//            }
//        }
//        System.out.println(hash);
//       HashMap<Integer,String> hashMap=new HashMap<>();
//       hashMap.put(101,"Math");
//       hashMap.put(102,"Science");
//       hashMap.put(103,"English");
//       hashMap.put(104,"Physics");
//       hashMap.put(105,"Chemistry");
//        System.out.println("Subject Codes are: ");
//        for (int i:hashMap.keySet()) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        for (HashMap.Entry<Integer,String>entry: hashMap.entrySet()){
//            System.out.println("subject code: "+entry.getKey()+" Subject: "+entry.getValue());
//        }
//        if(hashMap.containsKey(103)){
//            System.out.println("103 Exists in HashMap");
//        }
//        else{
//            System.out.println("does not exist");
//        }
//        hashMap.remove(104);
//        System.out.println(hashMap);
//       hashMap.put(1,"Charani");
//       hashMap.put(2,"Charan");
//       hashMap.put(3,"nani");
//       hashMap.put(4,"ishan");
//       hashMap.put(5,"kushi");
//        System.out.println(hashMap);
//        System.out.println("keys are: ");
//        for (HashMap.Entry<Integer,String>hash: hashMap.entrySet()) {
//            System.out.println("Student Id:"+hash.getKey()+"Name:"+hash.getValue());
//        }
//        System.out.println();
//        System.out.println("Values are: ");
//        for (String name : hashMap.values()) {
//            System.out.print(name +" ");
//        }
//        System.out.println();
//            if(hashMap.containsKey(5)){
//                hashMap.remove(5);
//            }
//
//        System.out.println(hashMap);
    }
}
