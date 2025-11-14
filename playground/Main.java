import vars.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Java");

        Arrays<Integer> arrData = new Arrays<Integer>();

        arrData.add(1);
        arrData.add(2);
        arrData.add(3);
        arrData.add(4);

        System.out.println(arrData.get(0));
        arrData.print();
    }
}