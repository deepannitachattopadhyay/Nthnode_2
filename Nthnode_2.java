public class nthNodefromend{
    public static Node nthNode(Node head,int n ){
        int size=0;
        Node temp= head;
        while(temp!=null){
            size++;
            temp= temp.next;
        }
        int m =size -n+1;
        // mth node from the start m=5
        // 10    20    30    40   50    60
        //head
        //temp
        //i=1   temp
        //i=2         temp
        //i=3                temp
        //i=4                      temp  so i<=m  so i<=5-1= 4
         temp=head;
        for (int i=1; i<=m-1;i++){
            temp =temp.next;

        }
        return temp;
    }
    //1 traverval using slow and fast concept for n=2
// example 10    20    30    40    50     60   null   
    //     head
    //     slow
    //     fast
    //n=1        fast
    //n=2              fast
//while loop
//                slow       fast
//                      slow       fast
//                           slow         fast
//                                 slow         fast=null so return slow
    public static Node nthNode2(Node head, int n){
        Node slow=head;
        Node fast=head;
        for(int i=1;i<=n;i++){
            fast = fast.next;
        }
        while(fast!=null){
            fast=fast.next;
            slow=slow.next;

        }
        return slow;
    }
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }
    public static void main(String[] args){
        Node a= new Node(10);
     Node b = new Node(20);
      Node c = new Node(30);
      Node d = new Node(40);
      Node e = new Node(50);
      Node f = new Node(60);
       a.next=b;
       b.next=c;
       c.next=d;
       d.next=e;
       e.next=f;
       // 10 20 30 40 50 60
       Node q=nthNode(a,3);
       System.out.println(q.data);
       Node q1=nthNode2(a,2);
       System.out.println(q1.data);




    }
}

// but in this code , 2 loop traversal is used so, more efficient is 1 traversal
