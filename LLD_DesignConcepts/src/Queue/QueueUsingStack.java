package Queue;

import java.util.Stack;

public class QueueUsingStack<G> {

    private Stack<G> stack1;
    private Stack<G> stack2;
    public void QueueUsingStack(){
        this.stack1 = new Stack<>();
        this.stack2 = new Stack<>();
    }

    public void enQueue(G data){
        stack1.push(data);
    }
    public G deQueue(){
        if(stack2.isEmpty()){
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


}
