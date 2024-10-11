import java.util.ArrayList;

public class array {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Aulia");
        list.add("Pasha");
        Object[] arr = new Object[list.size()];
        for (int i = 0; i < list.size(); i++) {
            arr[i] = "a"+i;
            System.out.println(list.get(i));
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
