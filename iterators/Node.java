package iterators;

import java.util.Iterator;

public class Node implements Iterable<Integer> {

    

    int data;
    Node nxt;

    Node(int data, Node nxt) {
        this.data = data;
        this.nxt = nxt;
    }
    
    
    @Override
    public Iterator<Integer> iterator() {

        return new NodeIterator(this);
    }
    
    public static class NodeIterator implements Iterator<Integer> {

        private Node temp;
        
        public NodeIterator(Node node) {
            temp = node;
        }
            
        @Override
        public boolean hasNext() {
            
            if (temp == null) {
                return false;
            }
            else {
                return true;
           }
        }

        @Override
        public Integer next() {
            Integer rval = temp.data;
            temp = temp.nxt;
            return rval;

        }
        
    }
    
}
