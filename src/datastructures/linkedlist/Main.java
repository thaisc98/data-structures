package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList likenkedList = new LinkedList(1);
        likenkedList.append(2);
        likenkedList.append(3);
        likenkedList.append(4);
//        // remove 2
//        System.out.println(likenkedList.removeLast().value);
//        // remove 1
//        System.out.println(likenkedList.removeLast().value);
//        // should return null
//        System.out.println(likenkedList.removeLast());
        // returns 1 node
//        System.out.println(likenkedList.removeFirst().value);
//        // returns 2 node
//        System.out.println(likenkedList.removeFirst().value);
//        // returns null
//        System.out.println(likenkedList.removeFirst());
//        likenkedList.remove(2);
        likenkedList.reverse();
        likenkedList.printList();
    }

}
