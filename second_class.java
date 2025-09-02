import java.util.Stack;

public class second_class {
    public static void main(String[] args) {
        // stack = LIFO data structure. Last-In First-Out
        // stores objects into a sort of "vertical tower"
        // push() to add to the top
        // pop() to remove from the top

        Stack<String> stack = new Stack<String>();

        System.out.println(stack.empty());

        stack.push("Tanvir");
        stack.push("Liza");
        stack.push("Raiyan");
        stack.push("Bro");
        stack.push("Code");

        // System.out.println(stack);
        // stack.pop(); // Top object will be removed
        // stack.pop();
        // stack.pop();
        // stack.pop();
        // stack.pop();

        // String myFavGame = stack.pop(); // Remove an object and stored in a variable
        // System.out.println(stack);
        // System.out.println(myFavGame);

        System.out.println(stack.peek()); // Without removing -> Only check
        System.out.println(stack.search("Tanvir"));
        System.out.println(stack.search("Tan")); // If not then return -1
        
    }
}