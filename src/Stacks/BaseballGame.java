package Stacks;

import java.util.Stack;

public class BaseballGame {
  public int calPoints(String[] operations) {
    Stack<Integer> stack = new Stack<>();
    int sum = 0;

    for (String str : operations)
      switch (str) {
        case "+" -> {
          var temp = stack.pop();
          var lastTwoSum = temp + stack.peek();
          stack.push(temp);
          stack.push(lastTwoSum);
        }
        case "D" -> stack.push(2 * stack.peek());
        case "C" -> stack.pop();
        default -> stack.push(Integer.parseInt(str));
      }

    while (!stack.isEmpty())
      sum += stack.pop();

    return sum;
  }
}
