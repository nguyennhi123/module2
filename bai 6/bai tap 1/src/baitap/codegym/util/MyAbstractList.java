package baitap.codegym.util;

public abstract class MyAbstractList<E> implements MyList<E> {
    protected int count = 0;

    protected MyAbstractList(){

    }

    protected MyAbstractList(E[] objects){
        for (int i = 0; i < objects.length; i++){
            add(objects[i]);
        }
    }

    @Override
    public void add(E e) {
        add(count, e);
    }

    @Override
    public boolean isEmpty() {
        return count == 0;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean remove(E e) {
        int index = indexOf(e);
        if(index >= 0){
            remove(index);
            return true;
        }
        return false;
    }
}
