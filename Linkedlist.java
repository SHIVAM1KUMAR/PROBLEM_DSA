public class Linkedlist{
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
     
        ll.add(2);
        ll.add(1);
        ll.add(3);
        ll.add(4);
        
    }
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;//Assigning the value 
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail;
    public void add(int data){

        //1.create a new node
        Node newNode=new Node(data);
      
        if(head==null){
            head=tail=newNode;
            return;
        }
    
        //2.newnode=head
        newNode.next=head;//link
        //3.head=newnode
        head=newNode;
    }
}
