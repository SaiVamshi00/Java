class LL{
    class Node{
        int data;
        Node next;
          Node(int data){
       this.data = data;
       this.next=null;
        }
  
    }
    public void getsize(){
        System.out.print(size);
    }
    private int size=0;
    Node head;
    public void insert_at_first(int val){
        Node newnode = new Node(val);
        size++;
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        newnode.data=val;
        head=newnode;
    }
    public void insert_at_position(int index,int val){
       
       
        Node newnode = new Node(val);
        if(index==0 || head ==null){
         newnode.next=head;
         head=newnode;
         size++;
         return;
        }
         if(index>=size ||index<0){
            System.out.println("invalid index value");
            return;
        }
        if(index>=1 && index<=size){
            Node temp,prev;
            prev=head;
            temp=head;
            size++;
            
                for(int i =1;i<=size;i++){
                    temp=temp.next;
                    if(i==index){
                  if(temp==null){
                    prev.next=newnode;
                    return;
                  }
                  prev.next=newnode;
                  newnode.next=temp;
                  return;
                    }
                    prev=prev.next;
                }
            

        }
    }
    
    public void insert_at_end(int val){
        Node newnode = new Node(val);
        size++;
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
    public void display(){
        if(head==null){
        System.out.print("List is empty");
        return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
      public static void main(String[] args) {
         LL list = new LL();
         list.insert_at_end(10);
         list.insert_at_end(20);
         list.insert_at_end(30);
         list.insert_at_end(40);
         list.display();
         list.insert_at_first(50);
         list.display();
         list.insert_at_position(2, 70);
         list.display();
         list.getsize();
        //  System.out.println(size);
     }
}
