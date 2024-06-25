package Generics;

/**
 * Pair
 */
public class genericPair<K, V> {

    K key;
    V value;

    public genericPair(K key,V value)
    {
        this.key = key;
        this.value = value;
    }
    
    K getFirst() {
        return this.key;
    }


    V getSecond() {
        return this.value;
    }

    public String toString() {
        return "i am toString of generic Pair";
    }
    
}