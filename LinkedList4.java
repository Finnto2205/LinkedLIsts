import java.util.LinkedList;

public class LinkedList4{
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

        uniLL.removeFirst(); //remove MU
        System.out.println(uniLL);

        uniLL.removeLast();; //remove UCC
        System.out.println(uniLL);


        String firstUni= uniLL.getFirst();
        System.out.println("First University: " + firstUni);
        String lastUni= uniLL.getLast();
        System.out.println("Last University: " + lastUni);
        System.out.println(uniLL);


    }
}