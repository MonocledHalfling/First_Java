public class Student extends Human {
    public Student(double weight, double height, String name) {
        super(weight, height, name);
    }

    public void suicide(String reason) {
        System.out.println(reason);
    }

    public void saySchool() {
        if (this instanceof Secondary)
            System.out.println("나는야 중학생!");

        if (this instanceof University)
            System.out.println("나는야 대학생이다!");

        if (this instanceof Elementary)
            System.out.println("나는야 잼민이!");
    }

    @Override
    public String toString() {
        return String.format("응애 나는 학생이얌");
    }
}
