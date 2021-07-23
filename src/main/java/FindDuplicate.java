import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindDuplicate {

    // Implement find duplicate numbers method.
    public List<Integer> printRepeating(List<Integer> array){
        Set<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (Integer number: array) {
            if (set.add(number) == false){
                list.add(number);
                System.out.println("Duplicate number is: "+number);
            }
        }
        return list;
    }
}
