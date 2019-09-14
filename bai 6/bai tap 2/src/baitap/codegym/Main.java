package baitap.codegym;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();

        list.add("America");
        list.add(0, "Canada");
        list.add("Russia");
        list.add("France");
        printList(list);

        list.removeFirst();
        printList(list);
    }

    public static void printList(MyLinkedList<String> list){
        System.out.println("-----List items-----");
        for (String s: list){
            System.out.print(s + ", ");
        }
        System.out.println();
    }
}
