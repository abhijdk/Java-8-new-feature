import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


class Student {
    int id;
    String name;
    int mark;

    public Student(int id, String name, int mark) {
        this.id = id;
        this.name = name;
        this.mark = mark;
    }
    public int getId(){
        return id;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mark=" + mark +
                '}';
    }
}





//  Sorted according to marks who take morethen 50%;
public class Sorted_According_To_Marks_Who_Take_Morethen_50 {

    public static void main(String[] args) {
        List<Student> al = new ArrayList<Student>();
        al.add(new Student(1, "Omm", 55));
        al.add(new Student(2, "Abhi", 5));
        al.add(new Student(3, "Jaga", 75));
        al.add(new Student(4, "Manoj", 65));
        al.add(new Student(5, "Depak", 50));
        List<Student> l = al.stream().filter(e->e.mark>50).collect(Collectors.toList());

        for (Object o:l){
            System.out.println(o);
        }
//      Sorted according to length
//        List<String> al=new ArrayList<>();
//        al.add("OMM");
//        al.add("JAGA");
//        al.add("DEPAK");
//        al.add("MANOJ");
//        al.add("ABHINNA");
//        Comparator <String> c=(a,b)->{
//            int l1=a.length();
//            int l2=b.length();
//            if(l1<l2) return -1;
//            else if (l1>l2) return +1;
//            else return a.compareTo(b);
//        };
//        List<String> l = al.stream().sorted(c).collect(Collectors.toList());
//        System.out.println(l);
    }
}
