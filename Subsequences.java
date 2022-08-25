import java.util.*;
public class Subsequences {
    public static void recur(String str,int idx,String newstr,ArrayList<String>hs){
        if(idx==str.length()){
            if(!hs.contains(newstr)){ //here we can only print the unique subsequences for example aaa-->aaa,aa,a
            hs.add(newstr);
            System.out.println(newstr);
            return ;
        }
        return;
    }

        char ch=str.charAt(idx);
        //to be
         recur(str,idx+1,newstr+ch,hs);
         //not be
         recur(str,idx+1,newstr,hs);


    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
String str=sc.next();
ArrayList<String>empty=new ArrayList<String>();
 recur(str,0,"",empty);

    }
}
