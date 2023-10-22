import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


//  To find Minimum value & Maximum value
public class Find_Minimum_And_Maximum_Value {


        List<Integer> al=new ArrayList<>();
        al.add(15);
        al.add(353);
        al.add(2277);
        al.add(158158);
        al.add(1);
        Integer min = al.stream().min((a, b) -> a.compareTo(b)).get();
        System.out.println("Minimum value is-: "+min);
        Integer max = al.stream().min((a, b) -> b.compareTo(a)).get();
        System.out.println("Maximum value is-: "+max);
    }
}
