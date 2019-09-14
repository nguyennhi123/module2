package baitap.codegym.util;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();

        list.add("America");
        list.add("Canada");
        list.add("Russia");
        list.add("France");
        printList(list);

        list.remove("Canada");
        printList(list);
    }

    public static void printList(MyList list){
        System.out.println("--------List items----------");
        for (int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }
}
