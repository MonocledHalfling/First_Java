public class Teacher extends Human {
    private double cls;

    public Teacher(double weight, double height, String name) {
        super(weight, height, name);
    }
    public void suicide(String reason) {
        System.out.println(reason);
    }

    public void printClass(double cls) {
        System.out.println(String.format("배정된 반 %f", cls));
        this.cls = cls;
    }

    @Override
    public String toString() {
        return String.format("배정된 반 %f", cls);
    }
}
