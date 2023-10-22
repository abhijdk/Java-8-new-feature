import java.*;


//  Uses of forEach Method to increase five marks in each 
public class Uses_Of_forEach_Method_To_Add_5_In_Each {

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
