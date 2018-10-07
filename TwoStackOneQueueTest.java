package com.company;

import java.util.Stack;

//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
public class TwoStackOneQueueTest {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    //push操作，每次用stack2接收一遍stack1出栈的所有元素
    public void push(int node) {
        while (!stack1.empty()){
            stack2.push(stack1.pop());
        }
        stack1.push(node);
        while (!stack2.empty()){
            stack1.push(stack2.pop());
        }
    }
    //pop时，stack1中的元素即是队列的顺序，直接pop即可
    public int pop() {
        if (!stack1.empty()){
            return stack1.pop();
        }else return 0;
    }

    //另一种解法：将pop和push方法调换，即pop时才挪动所有元素，效率更高
    //原理都是一样的，不再重复。

}
