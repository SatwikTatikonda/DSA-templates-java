package iterators;
import java.util.Iterator;

public class Client {
    

    public static void main(String[] args) {

        Node n5 = new Node(50, null);
        Node n4 = new Node(40, n5);
        Node n3 = new Node(30, n4);
        Node n2 = new Node(20, n3);
        Node n1 = new Node(10, n2);

        Iterator<Integer> itr = n1.iterator();

        while (itr.hasNext()) {

            System.out.println(itr.next());

        }

        for (int val : n1) {
            System.out.println(val);
        }

    }


}
