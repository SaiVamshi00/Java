
/*
class Node
{
	int data ;
	Node next;
	Node(int d)
	{
		data = d;
		next = null;
	}
}
*/

//Function to delete a node without any reference to head pointer.
class Nohead
{
    void deleteNode(Node del)
    {
         // Your code here
         Node curr=del;
         while(curr.next.next!=null){ //checking the data for the next next node
             curr=curr.next;     // updating the curr node
             del.data=curr.data; // copying THE DATA
             del=del.next;       //updating the del
         }
         curr=curr.next;
         del.data=curr.data;
         del.next=null; // making null for the last 2nd node
    }
}
