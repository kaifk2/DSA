package com.stack;

public class Stack {

    public static void main(String[] args) {
        // Assuming you want to create a stack with a specific size, for example, 5
        StackApp st = new StackApp(5);

        // Push elements to the stack
        st.push();
        st.push();
        st.push();

        // Display the current state of the stack
        st.display();

        // Pop an element from the stack
        st.pop();

        // Display the updated state of the stack
        st.display();
    }
}
