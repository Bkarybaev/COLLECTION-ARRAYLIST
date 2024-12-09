import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> i = new ArrayList<>();
        for (int j = 1; j <= 50; j++) {
            i.add(new Random().nextInt(1, 100));
        }

        ArrayList<Integer> i2 = new ArrayList<>();
        ArrayList<Integer> i3 = new ArrayList<>();
        for (int i1 = 0; i1 < i.size(); i1++) {
            if (i.get(i1) % 2 != 0) {
                i2.add(i.get(i1));
            }else if (i.get(i1) % 2 == 0) {
                i3.add(i.get(i1));
            }
        }


        System.out.println(i);
        System.out.println("tak san");
        System.out.println(i2);
        System.out.println("jup san");
        System.out.println(i3);
    }
}