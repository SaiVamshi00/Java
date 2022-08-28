
public class Reverse-Linkedlist-Iterative
{
    class Node{
        int data;
        Node next;
        Node(int data ){
            this.data=data;
            this.next=null;
        }
    }
     Node head;
    
    public  void insertdata(int val){
    Node newnode = new Node(val);
    if(head==null){
        head=newnode;
        return;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.next=newnode;
    }
    
    public  void print(){
        if(head==null)
        return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    public void reverse(){
        if(head==null||head.next==null) // checking there is atlest one element in the list
        return ;
        Node pre=head;    //this node points first node
        Node curr=pre.next;   // this node points the secound node
        while(curr!=null){    // checking current node i.e 2nd node is null
            Node nxt=curr.next;  // 3rd pointer at 3rd place
            curr.next=pre;     // pointing current node to previous one
            //update
            pre=curr;          // moving previous to front
            curr=nxt;          //moving current to front
            
        }
        head.next=null;  
        head=pre;           // At this point both curr and nxt pointer are null except pre which is at the last node. Make it point to head
    }
    
	public static void main(String[] args) {
	    Main obj=new Main();
	obj.insertdata(1);
	obj.insertdata(2);
	obj.insertdata(3);
	obj.insertdata(4);
	obj.insertdata(5);
	obj.print();
	obj.reverse();
	System.out.println();
	obj.print();
	}
}
