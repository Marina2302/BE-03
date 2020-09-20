package module02.lesson12;

import java.util.List;

public class ParameterizedClass<T, V, K> {
    private T st;
    private V in;
    private K bl;

    public K get(){
        return bl;
    }

    public List<String> getDefaultList(List<String> list){
        list.add("hello");
        list.add("hello");
        list.add("hello");
        list.add("hello");
        return list;
    }
}
