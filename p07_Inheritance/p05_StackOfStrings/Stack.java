package p07_Inheritance.p05_StackOfStrings;

import java.util.ArrayList;

public class Stack extends ArrayList<String> {

    private ArrayList<String> data;

    public Stack(){
        data = new ArrayList<>();
    }

    public void push(String string){
        data.add(string);
    }

    public String pop(){
        return data.remove(this.size() -1);
    }

    public String peek(){
        return data.get(this.size() - 1);
    }
    public boolean isEmpty(){
        return  data.isEmpty();
    }
}

