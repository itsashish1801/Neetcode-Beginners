package Stacks;

import java.util.List;
import java.util.Stack;

public class ValidParentheses {
  private final List<Character> openingBrackets = List.of('(', '[', '{');
  private final List<Character> closingBrackets = List.of(')', ']', '}');

  public boolean isValid(String s) {
    Stack<Character> stack = new Stack<>();

    for (char ch : s.toCharArray()) {
      if (openingBrackets.contains(ch))
        stack.push(ch);
      else {
        if (stack.isEmpty())
          return false;

        var top = stack.pop();
        if (openingBrackets.indexOf(top) != closingBrackets.indexOf(ch))
          return false;
      }
    }

    return stack.isEmpty();
  }
}
