package Stacks;

import java.util.Stack;

public class MinStack {
  private class Node {
    private int val;
    private int min;

    public Node(int val, int min) {
      this.val = val;
      this.min = min;
    }
  }

  private Stack<Node> stack;

  public MinStack() {
    this.stack = new Stack<>();
  }

  public void push(int val) {
    if (stack.isEmpty()) {
      stack.push(new Node(val, val));
      return;
    }

    var prevMin = stack.peek().min;

    if (val < prevMin) {
      stack.push(new Node(val, val));
      return;
    }
    stack.push(new Node(val, prevMin));
  }

  public void pop() {
    stack.pop();
  }

  public int top() {
    return stack.peek().val;
  }

  public int getMin() {
    return stack.peek().min;
  }
}
