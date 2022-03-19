import java.util.ArrayList;
import java.util.List;

public class Human {
    private double weight;
    private double height;
    public String name;

    public Human(double weight, double height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public void printInfo() {
        System.out.println(String.format("키는 %f, 몸무게는 %f, 이름은 %s", height, weight, name));
    }

    public ArrayList<University> filterUniversity(ArrayList<Human> hmList) {
        ArrayList<University> unis = new ArrayList<>();
        for (Human i: hmList){
            if (i instanceof University) {
                University uni = (University) i;
                unis.add(uni);
            }
        }
        return unis;
    }

    @Override
    public String toString() {
        return String.format("응애 나는 닝겐이얌");
    }

}
