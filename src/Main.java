public class Main {
    public static void main(String[] args){
        System.out.println("hello world");

        test barcode = new Student(100, 100, "barcode");
        barcode.printInfo();
        test onetwothree = new Teacher(100, 100, "빡빡이");
        onetwothree.printInfo();
        test haji = new Elementary(100,100, "haji");
        haji.printInfo();

        if (barcode instanceof Student) {
            ((Student) barcode).suicide("의문사");

        if (onetwothree instanceof Teacher) {
            ((Teacher) onetwothree).printClass(1);
        }

        if (haji instanceof Elementary) {
            ((Elementary) haji).suicide("W");
        }

        System.out.println(onetwothree);
        System.out.println(barcode);
        System.out.println(haji);



        }
    }
}
