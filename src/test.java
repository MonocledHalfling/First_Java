import java.util.ArrayList;
import java.util.List;

public class test {
    private double weight;
    private double height;
    private String name;

    public test(double weight, double height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public void printInfo() {
        System.out.println(String.format("키는 %f, 몸무게는 %f, 이름은 %s", height, weight, name));
    }

    private final List<String> values0 = new ArrayList<>();

    public void filterUniversity() {
        if (this instanceof University)
            values0.add(this.name);
    }

    @Override
    public String toString() {
        return String.format("응애 나는 닝겐이얌");
    }

}
