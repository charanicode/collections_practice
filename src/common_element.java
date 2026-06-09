import java.util.HashSet;

public class common_element {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {6, 7, 3, 9};
        HashSet<Integer> numbers=new HashSet<>();
        for(int i:arr1){
                numbers.add(i);
        }
        for (int num:arr2) {
            if(numbers.contains(num)){
                System.out.println("common element "+num);
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
}
