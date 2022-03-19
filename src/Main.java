import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("hello world");

        Human barcode = new Student(100, 100, "barcode");
        barcode.printInfo();
        Human onetwothree = new University(100, 100, "빡빡이");
        onetwothree.printInfo();
        Human haji = new University(100,100, "haji");
        haji.printInfo();

        if (barcode instanceof Student) {
            ((Student) barcode).suicide("의문사");

        if (onetwothree instanceof Teacher) {
            ((Teacher) onetwothree).printClass(1);
        }

        if (haji instanceof Elementary) {
            ((Elementary) haji).suicide("W");
        }

        ArrayList<Human> hm = new ArrayList<>();
        hm.add(barcode);
        hm.add(onetwothree);
        hm.add(haji);

        ArrayList<University> aaa = barcode.filterUniversity(hm);
        System.out.println(aaa);

        }
    }
}
