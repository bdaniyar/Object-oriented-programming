package problem3;

import java.util.ArrayList;

class MyArrayCollection<T> implements MyCollection<T> {

    private ArrayList<T> data = new ArrayList<>();

    public void add(T element) {
        data.add(element);
    }

    public void remove(T element) {
        data.remove(element);
    }

    public boolean contains(T element) {
        return data.contains(element);
    }

    public int size() {
        return data.size();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void clear() {
        data.clear();
    }
}