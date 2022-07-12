public class Node<T> {
    private T data;
    private Node<T> next;
    private Node<T> prev;

    public Node(T data){
        this.data = data;
    }
    public Node(T data, Node<T> prev, Node<T> next){
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public void setData(T data){ this.data = data; }
    public void setNext(Node<T> next){ this.next = next; }
    public void setPrev(Node<T> prev){ this.prev = prev; }
    public T getData(){ return this.data; }
    public Node<T> getNext(){ return this.next; }
    public Node<T> getPrev(){ return this.prev; }
    public void delThisNode(){
        Node<T> previousCurrent = this.getPrev();
        Node<T> nextCurrent = this.getNext();

        if(previousCurrent != null){ previousCurrent.setNext(nextCurrent); } // if remove single element
        if(nextCurrent != null){ nextCurrent.setPrev(previousCurrent); }

        this.setPrev(null);
        this.setNext(null);
    }

    @Override
    public boolean equals(Object obj){
        if(obj == this) return true;
        if(obj == null || obj.getClass() != this.getClass()) return false;
        return this.data.equals(obj);
    }

    @Override
    public String toString(){
        return this.getData().toString();
    }
}
