package StaticArrays;

public class ShuffleTheArray {
  public int[] shuffle(int[] nums, int n) {
    var result = new int[nums.length];
    int count = 0;
    int index = 0;

    for (int i = n; i < nums.length; i++) {
      result[index++] = nums[count];
      result[index++] = nums[i];
      count++;
    }

    return result;
  }
}
