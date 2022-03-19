public class Secondary extends Student {
    public Secondary(double weight, double height, String name) {
    super(weight, height, name);
}

    public void suicide(String reason) {
        System.out.println(reason);
    }

    @Override
    public String toString() {
        return String.format("응애 나는 중2병 이얌");
    }
}
