package Tugas_6;
public class MainStack {
   public static void main(String[] args) {
        stack newStack = new stack(10);
        newStack.push(50);
        newStack.show();
        newStack.push(100);
        newStack.show();
        newStack.pop();
        newStack.show();
        newStack.push(60);
        newStack.show();
        newStack.push(80);
        newStack.show();
        newStack.pop();
        newStack.show();
        long bacaTop = newStack.peek();
        System.out.println("nilai top = "+bacaTop); 
}
}
