
package Week2;

//use generic type Item
// any occurence of item in implementation will be replaced
// by a client-supplied data type name
public class Stack<Item> {
    // top of stack
    private Node first;
    // keep track of number of items in stack
    private int N;

    private class Node {
        Item item;
        Node next;
    }

    // isEmpty, check if first is null or n is 0
    public boolean isEmpty() {
        return first == null;
    }

    // size: increment n when push / pop
    public int size() {
        return N;
    }

    // push: add to beginning of string, 144
    public void push(Item item) {
        Node temp = first;
        first = new Node();
        first.item = item;
        first.next = temp;
        N++;
    }

    // pop: remove from beginning, 145
    public Item pop() {
        Item item = first.item;
        first = first.next;
        N--;
        return item;
    }

    // 155 -> iterator,

    public Iterator<Item> iterator() {
        return new ListIterator();
    }

    private class ListIterator implements Iterator<Item> {
        private Node current = first;

        public boolean hasNext() {
            return current != null;
        }

        public void remove() {
        }

        public Item next() {
            Item item = current.item;
            current = current.next;
            return item;
        }
    }

    // 147 -> test client main

    public static void main(String[] args) {
        // create stack and push/pop strings as directed on stdin
        Stack<String> s = new Stack<String>();

        while (!StdIn.isEmpty()) {
            String item = StdIn.readString();
            if (!item.equals("-")) {
                s.push(item);
            } else if (!s.isEmpty()) {
                StdOut.print(s.pop() + " ");
            }
            StdOut.println("(" + s.size() + " left on stack)");
        }
    }

    // main function ends

    // traversing through linked list
    for(

    Node x = first;x!=null;x=x.next)
    {
        // process x.item
    }

}

/*
 * From post fix to answer:
 * Algorithm: maintain a stack and scan the
 * postfix expression from left to right
 * – If the element is a number, push it into the
 * stack
 * – If the element is a operator O, pop twice
 * and get A and B respectively. Calculate
 * BOA and push it back to the stack
 * – When the expression is ended, the number
 * in the stack is the final answer
 * 
 * questions:
 * do we just assume that the user inputs an infix expression and then
 * our algorithm converts it?
 * 
 * 
 * // linkedlist practice
 * private class Node {
 * Item item;
 * Node next;
 * 
 * Node first = new Node();
 * Node second = new Node();
 * Node third = new Node();
 * 
 * first.item = 1;
 * second.item = 2;
 * 
 * 
 * 
 * }
 */