import java.util.LinkedList;

public class LinkedList3{
    public static void main(String[] args){

        var uniLL= new LinkedList<String>();

        uniLL.add("ATU");
        uniLL.add("TCD");
        uniLL.add("UCD");
        uniLL.add("DIT");
        
        System.out.println(uniLL);

        uniLL.addFirst("MU");
        System.out.println(uniLL);
        uniLL.addLast("UCC");   
        System.out.println(uniLL);

        uniLL.removeFirst();
        System.out.println(uniLL);

        uniLL.removeLast();
        System.out.println(uniLL);
    }
}