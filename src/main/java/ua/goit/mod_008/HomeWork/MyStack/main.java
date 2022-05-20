package ua.goit.mod_008.HomeWork.MyStack;

import java.util.Stack;

/*
- remove(int index) удаляет элемент под индексом-----
- peek() возвращает первый элемент в стеке (LIFO) - without removing
peek() Throws: EmptyStackException – if this stack is empty.
- pop() возвращает первый элемент в стеке и удаляет его из коллекции
pop() Throws: EmptyStackException – if this stack is empty.
*/

public class main {
    public static void main(String[] args) {
        Stack <String> stack = new Stack<>();
        stack.push("Stack 001");
        stack.push("Stack 002");
        stack.push("Stack 003");
        stack.push("Stack 004");
        stack.push("Stack 005");

        stack.remove(1);
        System.out.println(stack.size());
        stack.clear();
        System.out.println(stack);

        MyStack<String> myStack = new MyStack<>();
        myStack.push("My Stack 001");
        myStack.push("My Stack 002");
        myStack.push("My Stack 003");
        myStack.push("My Stack 004");
        myStack.push("My Stack 005");
        System.out.println(myStack);
        myStack.clear();
        System.out.println(myStack);
    }
}
