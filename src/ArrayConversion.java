import java.util.ArrayList;
import java.util.Arrays;

public class ArrayConversion {
    // Converts array to ArrayList and vice versa
    public static void convert() {
        // Array to ArrayList
        String[] array = {"Java", "Python", "C++"};
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(array));
        System.out.println("Converted to ArrayList: " + arrayList);

        // ArrayList to Array
        String[] newArray = new String[arrayList.size()];
        arrayList.toArray(newArray);
        System.out.println("Converted back to Array: " + Arrays.toString(newArray));
    }
}
