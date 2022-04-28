package datastructures.doublylinkedlist;

public class Main {

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList(0);
        dll.append(1);
        dll.append(2);

//        System.out.println(dll.removeLast());
//        System.out.println(dll.removeLast());
//        System.out.println(dll.removeLast());

//        System.out.println(dll.removeFirst());
//        System.out.println(dll.removeFirst());
//        System.out.println(dll.removeFirst());
//        dll.getTail();
//        dll.getLength();
//        dll.getHead()
//        System.out.println(dll.get(1).value);
//        System.out.println(dll.get(2).value + "\n");
//        dll.set(1,4);
//        dll.insert(1,2);
        dll.remove(1);
        dll.printList();

    }
}
