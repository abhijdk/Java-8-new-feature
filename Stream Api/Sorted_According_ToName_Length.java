import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted_According_ToName_Length {

    public static void main(String[] args) {
//      Sorted according to length
        List<String> al=new ArrayList<>();
        al.add("OMM");
        al.add("JAGA");
        al.add("DEPAK");
        al.add("MANOJ");
        al.add("ABHINNA");
        Comparator <String> c=(a,b)->{
            int l1=a.length();
            int l2=b.length();
            if(l1<l2) return -1;
            else if (l1>l2) return +1;
            else return a.compareTo(b);
        };
        List<String> l = al.stream().sorted(c).collect(Collectors.toList());
        System.out.println(l);
    }
}
