class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
    public class PalindromeLL {
        public static Node reverse(Node head){
            Node curr=head;
            Node prev=null;
            Node agla=null;
            while(curr!=null){
                agla=curr.next;
                curr.next=prev;
                prev=curr;
                curr=agla;
            }
            return prev;
        }
        public static boolean palindrome(Node head){
             Node slow=head;
             Node fast=head;
             while(fast.next!=null && fast.next.next!=null){
                slow=slow.next;
                fast=fast.next.next;
             }
             Node temp=reverse(slow.next);
             slow.next=temp;
             Node p1=head;
             Node p2=temp;
             while(p2!=null){
                if(p1.data!=p2.data){
                    return false;
                }
                p1=p1.next;
                p2=p2.next;
             }
             return true;
        }
    public static void main(String[] args) {
        Node a=new Node(10);
        Node b=new Node(20);
        Node c=new Node(30);
        Node d=new Node(20);
        Node e=new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        System.out.println(palindrome(a));
        
    }
}
