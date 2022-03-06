public class Runner {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(41);
        list.show();

        System.out.println("Insert......");
        list.insertAtStart(4);
        list.show();

        System.out.println("Insert At......");
        list.insertAt(10, 6);
        list.show();
    }
}
