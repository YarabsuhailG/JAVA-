
import java.util.*;


class  stack<T> {
    private ArrayList<T> stacklist;

    public stack (){
        stacklist = new ArrayList<>();

    }

    public void push (T data ) {
        stacklist.add(data);
    }
    public T pop(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return stacklist.remove(stacklist.size()-1);
    }

    public T peek(){
        if (isEmpty()){
            System.out.println("Stack is empty");
            return null;
        }
        return stacklist.get(stacklist.size()-1);
    }
    public boolean isEmpty(){
        return stacklist.isEmpty();
    }
    public int size(){
        return stacklist.size();
    }
    public static void main(String[]args){
        stack<String> stack =new stack<>();
        stack.push("Apple");
        stack.push("banana");
        stack.push("Cherry");
        System.out.println("stack size:"+ stack.size());
        System.out.println("Top element:"+ stack.peek());
        while(!stack.isEmpty()){
            System.out.println ("Popped:"+stack.pop());
        }
    }
}


