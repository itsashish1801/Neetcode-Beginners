public class ConcatenationOfArray {
  public int[] getConcatenation(int[] nums) {
    var result = new int[nums.length * 2];

    for (int i = 0; i < nums.length; i++)
      result[i] = result[nums.length + i] = nums[i];

    return result;
  }
}
