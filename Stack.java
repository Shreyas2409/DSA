


public class Stack {
    int top;
    int[] arr;

    public Stack(){
        this.top = -1;
        this.arr = new int[10];        
    }

    public Stack(int arrSize){
        this.top = -1;
        this.arr = new int[arrSize];        
    }

    public void push(int item){
        arr[++top]  = item;
    }

    public int pop(){
        // can be also done the below way
        // top -= 1;
        // return arr[top];
        if(top != -1)
            return arr[top--];
        return -1;
    }

    public int peek(){
        if(top != -1)
            return arr[top];
        return -1;
    }


    public String toString(){
        StringBuilder sb = new StringBuilder();
        
        while(top != -1){
            sb.append(arr[top]).append(" ");
            top -= 1;
        }

        return sb.toString();
    }


    public static void main(String[] args) {
        Stack st = new Stack();
        
        st.push(10);
        st.push(20);

        System.out.println(st.peek());
        System.out.println(st);

        st.pop();
        
        System.out.println(st.peek());
        System.out.println(st);
    }
}