package module02.lesson12;

import java.util.List;

public class ParameterizedClass<T, V, K> {
    private T st;
    private V in;
    private K bl;

    public K get(){
        return bl;
    }

    public List<T> getDefaultList(List<T> list){
        list.add((T) "hello");
        list.add((T) "hello");
        list.add((T) "hello");
        list.add((T) "hello");
        return list;
    }
}
