public class LinkedList {

    private Node head;

    public int listLength(){
        int count = 0;
        Node temp = head;
        while(temp.next != null){
            count ++;
            temp=temp.next;
        }

        return count;
    }

    public void insert(int key){
        Node node = new Node();
        node.data = key;
        node.next=null;

        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }

    public void insertAtStart(int key){
        Node node = new Node();
        node.data = key;
        node.next = head;

        head = node;
    }

    public void insertAt(int position, int key){
        int len = listLength();
        if(position <= len){
            if(position == 0) insertAtStart(key);

            else{
                Node temp = head.next;
                int i=1;
                while(temp.next != null){
                    if(i != position){
                        i++;
                        temp=temp.next;
                    }
                    else{
                        Node node = new Node();
                        node.data = key;
                        node.next = temp.next;

                        temp.next = node;
                        break;
                    }
                }
            }
        }
        else{
            System.out.println("List length is " + len + " : Provided value " + position + " too big");
            System.out.println("Adding value at end of list..............");
            insert(key);
        }
    }

    public void show(){
        Node node = head;

        while (node.next !=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}
