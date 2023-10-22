import java.*;


//  Uses of forEach Method inpliment in System.out.println();
public class Main {

    public static void main(String[] args) {


        List<Integer> al=new ArrayList<>();
        al.add(15);
        al.add(353);
        al.add(2277);
        al.add(158158);
        al.add(1);
        al.stream().forEach(System.out::println);
        al.stream().forEach(e-> System.out.println(e+5));
    }
}
