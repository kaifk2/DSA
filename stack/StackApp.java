package com.stack;

import java.util.Scanner;

public class StackApp {

    private int s[];
    private int size;
    private int top = -1;

    private Scanner scan = new Scanner(System.in);

    public StackApp(int n) {
        s = new int[n];
        size = s.length;
    }

    public void push() {
        int element;

        if (top == size - 1) {
            System.out.println("Push not possible");
        } else {
            System.out.println("Enter an element");
            element = scan.nextInt();
            s[++top] = element; // Store the entered element in the array
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Pop not possible");
        } else {
            System.out.println("Element deleted is " + s[top]);
            --top;
        }
    }

    public void display() {
        if (top == -1) {
            System.out.println("Display is not possible");
        } else {
            for (int i = top; i >= 0; i--) {
                System.out.println(s[i]);
            }
        }
    }
}
