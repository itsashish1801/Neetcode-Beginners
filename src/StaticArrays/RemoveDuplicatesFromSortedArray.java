package StaticArrays;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {
  public int removeDuplicates(int[] nums) {
    Set<Integer> set = new HashSet<>();
    int count = 0;

    for (int i : nums)
      if (!set.contains(i)) {
        set.add(i);
        nums[count++] = i;
      }

    return count;
  }
}