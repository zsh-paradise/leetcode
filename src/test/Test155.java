package test;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by zsh_paradise on 2018/9/12.
 *
 * 设计一个支持 push，pop，top 操作，
 * 并能在常数时间内检索到最小元素的栈。

 push(x) -- 将元素 x 推入栈中。
 pop() -- 删除栈顶的元素。
 top() -- 获取栈顶元素。
 getMin() -- 检索栈中的最小元素。
 示例:

 MinStack minStack = new MinStack();
 minStack.push(-2);
 minStack.push(0);
 minStack.push(-3);
 minStack.getMin();   --> 返回 -3.
 minStack.pop();
 minStack.top();      --> 返回 0.
 minStack.getMin();   --> 返回 -2.
 */
public class Test155 {
    //数据栈
    private Stack<Integer> stackData;
    //最小栈
    private Stack<Integer> stackMin;

    /** initialize your data structure here. */
    public  Test155() {
        this.stackData = new Stack<Integer>();
        this.stackMin  = new Stack<Integer>();
    }

    public void push(int x) {
        if(this.stackMin.isEmpty() ){
            this.stackMin.push(x);
        }else if (getMin() > x ){
            this.stackMin.push(x);
        }
        this.stackData.push(x);
    }

    public void pop() {
        Integer num = stackData.pop();

        if(this.stackMin.peek().equals(num) && !stackData.contains(num)){
            this.stackMin.pop();
        }

    }

    public int top() {
        Integer num = stackData.peek();
        if(this.stackMin.peek().equals(num)){
            return this.stackMin.peek();
        }
        return num ;
    }

    public int getMin() {
        if(this.stackMin.isEmpty()){
            throw new EmptyStackException();
        }else {
            return  this.stackMin.peek();
        }


    }


}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
