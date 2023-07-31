public class StackArray
{
    private static final int N = 3;
    private int top, sarray[];
    // constructors
    public StackArray() {
        this(N);
    }
    public StackArray(int n) {
        top = 0;
        sarray = new int[n];
    }
    // value returning methods
    public boolean empty() {
        return top <= 0;
    }
    public boolean full() {
        return top >= sarray.length;
    }
    public int pop() {
        if(empty())
            throw new RuntimeException("Stack is empty");
        top--;
        return sarray[top];
    }
    // void method
    public void push(int item) {
        if(full())
            throw new RuntimeException("Stack is full");
        sarray[top]=item;
        top++;
    }
}
