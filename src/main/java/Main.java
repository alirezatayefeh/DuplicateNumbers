import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2,3,5,7,12,3,2,4,6,9);

        //Create an instance from FindDuplicate class.
        FindDuplicate findDuplicate = new FindDuplicate();

        findDuplicate.printRepeating(list);

    }
}
