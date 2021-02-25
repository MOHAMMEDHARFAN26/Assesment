import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        final List list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(3);
        list.remove(2);
        System.out.println(list);
    }
}