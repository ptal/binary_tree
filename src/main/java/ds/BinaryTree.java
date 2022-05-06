package ds;

public class BinaryTree<K extends Comparable<K>, V> {
    private Node<K, V> root;
    private int size;
    
    public BinaryTree() {
        root = null;
        size = 0;
    }
    
    private void checkKey(K key) {
        if (key == null) {
            throw new NullKeyException();
        }
    }
    
    public void clear() {
        
    }
    
    public int size() {
        return 0;
    }
    
    public boolean isEmpty() {
        return false;
    }
    
    public V get(K key) {
        return null;
    }
    
    public V put(K key, V value) {
        return null;
    }
    
    public V remove(K key) {
        return null;
    }
    
    public boolean contains(K key) {
        return false;
    }
    
    private static class Node<K extends Comparable<K>, V> {
        private K key;
        private V value;
        private Node<K, V> parent;
        private Node<K, V> childLeft;
        private Node<K, V> childRight;
        
        private Node(K key, V value, Node<K, V> parent) {
            this(key, value, parent, null, null);
        }
        
        private Node(K key, V value, Node<K, V> parent, Node<K, V> childLeft, Node<K, V> childRight) {
            this.key = key;
            this.value = value;
            this.parent = parent;
            this.childLeft = childLeft;
            this.childRight = childRight;
        }
    }

}
