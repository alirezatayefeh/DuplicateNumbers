import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FindDuplicateTest {
    private FindDuplicate findDuplicate = new FindDuplicate();

    @Test
    public void printRepeatingTest(){
        List<Integer> list = Arrays.asList(4,5,3,2,5,6,7,8,7,12,14,21,9,4);
        List<Integer> expectValue = Arrays.asList(5,7,4);
        List<Integer> actualValue = findDuplicate.printRepeating(list);
        Assert.assertArrayEquals(new List[]{expectValue}, new List[]{actualValue});
    }
}
