import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {

    // Implement find duplicate numbers method.
    public void printRepeating(int array[]){
        Set<Integer> set = new HashSet<>();

        for (Integer number: array) {
            if (set.add(number) == false){
                System.out.println("Duplicate number is: "+number);
            }
        }
    }
}
