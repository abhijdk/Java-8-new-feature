import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;


//  Convort_ArrayList_To_Normal_Integer_Array
public class Convort_ArrayList_To_Normal_Integer_Array {

    public static void main(String[] args) {

        List<Integer> al=new ArrayList<>();
        al.add(15);
        al.add(353);
        al.add(2277);
        al.add(158158);
        al.add(1);

        Integer [] arr=al.stream().toArray(Integer[]::new);
        for(Integer i:arr){
            System.out.println(i);
        }
    }
}
