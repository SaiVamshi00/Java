import java.util.*;
public class TwoDlists{
public static void main(String args[]){
ArrayList<String>friends = new ArrayList<>();
friends.add("hari prasad");
friends.add("hemanth");
friends.add("rohith");
System.out.println(friends);

ArrayList<String>family = new ArrayList<>();
family.add("raj mohan");
family.add("sony");
family.add("lahari");
System.out.println(family);

ArrayList<String>myteachers = new ArrayList<>();
myteachers.add("sarojini mam");
myteachers.add("ram prasad sir");
myteachers.add("bala krishna sir");
System.out.println(myteachers);

//----------------------------------------list inside a list-----------
ArrayList<ArrayList<String>>ll =new ArrayList<>();
ll.add(friends);
ll.add(family);
ll.add(myteachers);
System.out.println(ll);

//-----------------------------------------accessing-----------------
 System.out.println(ll.get(0));
 System.out.println(ll.get(0).get(1));
 ll.get(0).add("surya");
 System.out.println(ll.get(0));
}
}