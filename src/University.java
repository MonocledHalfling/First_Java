public class University extends Student{
    public University(double weight, double height, String name) {
        super(weight, height, name);
    }

    public void suicide(String reason) {
        System.out.println(reason);
    }

    @Override
    public String toString() {
        return String.format("응애 나는 대학생이얌");
    }
}
