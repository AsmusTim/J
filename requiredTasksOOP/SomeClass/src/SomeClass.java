import java.util.*;

public class SomeClass<T> implements List<T> {


    private Node<T> first;
    private Node<T> last;
    private int size = 0;

    private Node<T> runToList(int index){
        Node<T> current = this.first;
        for(int i = 0; i < index; i++){
            current = current.getNext();
        }
        return current;
    }
    private void delNode(Node<T> node){
        if(this.size == 1){
            this.first = null;
            this.last = null;
        }
        if(node == this.first){
            this.first = this.first.getNext();
        }
        node.delThisNode();
        this.size--;
    }

    @Override
    public boolean add(T data) {
        if(this.last == null && this.first == null){
            this.first = new Node<T>(data, null, null);
            this.last = this.first;
        }
        else{
            Node<T> node = new Node<T>(data);
            node.setPrev(this.last);
            this.last.setNext(node);
            this.last = node;
        }
        this.size++;
        return true;
    }

    @Override
    public void add(int index, T data)throws IndexOutOfBoundsException {
        if(index < 0 || index >= this.size()){ throw new IndexOutOfBoundsException(); }
        else{
            Node<T> node = new Node<T>(data);
            Node<T> current = this.runToList(index);

            node.setPrev(current.getPrev());
            node.setNext(current);
            Node<T> previousCurrent = current.getPrev();
            previousCurrent.setNext(node);
            current.setPrev(node);
            this.size++;
        }
    }

    @Override
    public T set(int index, T element)throws IndexOutOfBoundsException {
        if(index < 0 || index >= this.size()){ throw new IndexOutOfBoundsException(); }
        Node<T> current = this.runToList(index);
        current.setData(element);
        return element;
    }

    @Override
    public T get(int index)throws IndexOutOfBoundsException {
        if(index < 0 || index >= this.size()){ throw new IndexOutOfBoundsException(); }
        Node<T> current = this.runToList(index);
        return current.getData();
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size == 0;
    }

    @Override
    public boolean contains(Object o) {
        Node<T> current = this.first;
        while(current != null){
            if(o.equals(current.getData())){ return true; }
            else{ current = current.getNext(); }
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                T res = get(index);
                index++;
                return res;
            }
        };
    }

    @Override
    public Object[] toArray() {
        Object[] arr = new Object[this.size];
        Node<T> current = this.first;
        for(int i = 0; i < this.size(); ++i){
            arr[i] = current.getData();
            current = current.getNext();
        }
        return arr;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        T1[] arr = (T1[]) new Object[this.size];
        Iterator<T> e = this.iterator();
        for(int i = 0; i < this.size; ++i){
            arr[i] = (T1) e.next();
        }
        return arr;
    }

    @Override
    public boolean remove(Object o) {
            Node<T> current = this.first;
            while (current != null) {
                if (o.equals(current.getData())) {
                    delNode(current);
                    return true;
                } else {
                    current = current.getNext();
                }
            }
        return false;
    }

    @Override
    public T remove(int index)throws IndexOutOfBoundsException {
        if(index < 0 || index >= this.size()){ throw new IndexOutOfBoundsException(); }
        Node<T> current = this.runToList(index);
        T t = (T) current.getData();
        delNode(current);
        this.size--;
        return t;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(obj == null || obj.getClass() != this.getClass()) return false;

        SomeClass<T> list = (SomeClass<T>) obj;

        if(this.size != list.size()) return false;

        Node<T> current = this.first;
        Iterator<T> e = list.iterator();
        while(current != null && e.hasNext()){
            if(!current.equals(e.next())) return false;
            current = current.getNext();
        }
        return true;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for (Object o : c) {
            if (!this.contains(o)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for (T t : c) {
            this.add(t);
        }
        return true;
    }

    @Override
    public boolean addAll(int index, Collection<? extends T> c) {
        Iterator<? extends T> e = c.iterator();
        int cSize = c.size();
        Node<T> leftSide = this.runToList(index);
        Node<T> rightSide = leftSide.getNext();
        while(e.hasNext()){
            Node<T> node = new Node<>(e.next(), leftSide, null);
            leftSide.setNext(node);
            leftSide = leftSide.getNext();
        }
        if(rightSide != null){
            rightSide.setPrev(leftSide);
        }
        leftSide.setNext(rightSide);
        this.size += cSize;
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for (Object o : c) {
            if(this.remove(o));
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        Node<T> current = this.first;
        while (current != null){
            if(!c.contains(current.getData())){
                Node<T> mid = current.getNext();
                delNode(current);
                current = mid;
                continue;
            }
            current = current.getNext();
        }
        return true;
    }

    @Override
    public void clear() {
        Node<T> current = this.last;
        while(current != null){
            this.last = last.getPrev();
            current.setPrev(null);
            current = this.last;
            this.size--;
        }
        //this.first = this.first.getPrev();
        //this.size = 0;
    }

    @Override
    public int indexOf(Object o) {
        Node<T> current = this.first;
        int index = 0;
        while(current != null){
            if(o.equals(current.getData())){ return index; }
            else{
                current = current.getNext();
                index++;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        Node<T> current = this.first;
        int index = 0;
        int lastIndex = -1;
        while(current != null){
            if(current.getData().equals(o)){ lastIndex = index; }
            current = current.getNext();
            index++;
        }
        return lastIndex;
    }

    @Override
    public ListIterator<T> listIterator() {
        return new ListIterator<T>(){

            int index = 0;

            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public T next() {
                int i = index;
                index++;
                return get(i);
            }

            @Override
            public boolean hasPrevious() {
                return 0 < index;
            }

            @Override
            public T previous() {
                int i = index - 1;
                index--;
                return get(i);
            }

            @Override
            public int nextIndex() {
                int i = index + 1;
                return hasNext() ? i : size;
            }

            @Override
            public int previousIndex() {
                int i = index - 1;
                return hasPrevious() ? i : -1;
            }

            @Override
            public void remove() {
                Node<T> node = runToList(index);
                SomeClass.this.delNode(node);
            }

            @Override
            public void set(T t) {
                SomeClass.this.set(index, t);
            }

            @Override
            public void add(T t) {
                int i = index + 1;
                SomeClass.this.add(i, t);
            }
        };
    }

    @Override
    public ListIterator<T> listIterator(int index)throws IndexOutOfBoundsException {
        if(index < 0 || index > size()) throw new IndexOutOfBoundsException();
        else {
            return new ListIterator<T>() {
                int i = index;

                @Override
                public boolean hasNext() {
                    return i < size;
                }

                @Override
                public T next() {
                    int it = i;
                    i++;
                    return get(it);
                }

                @Override
                public boolean hasPrevious() {
                    return index < i;
                }

                @Override
                public T previous() {
                    int it = i - 1;
                    i--;
                    return get(it);
                }

                @Override
                public int nextIndex() {
                    int it = i + 1;
                    return hasNext() ? it : size;
                }

                @Override
                public int previousIndex() {
                    int it = i - 1;
                    return hasPrevious() ? it : -1;
                }

                @Override
                public void remove() {
                    Node<T> node = runToList(i);
                    SomeClass.this.delNode(node);
                }

                @Override
                public void set(T t) {
                    SomeClass.this.set(i, t);
                }

                @Override
                public void add(T t) {
                    int it = i + 1;
                    SomeClass.this.add(it, t);
                }
            };
        }
    }

    @Override
    public List<T> subList(int fromIndex, int toIndex)throws IndexOutOfBoundsException{
        if(fromIndex < 0 || toIndex > size || fromIndex > toIndex) throw new IndexOutOfBoundsException();
        List<T> list = new ArrayList<>();
        Node<T> current = this.runToList(fromIndex);
        for(int i = 1; i < toIndex - fromIndex + 1; ++i){
            list.add(current.getData());
            current = current.getNext();
        }
        return list;
    }
}
