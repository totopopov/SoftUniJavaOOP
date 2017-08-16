package StackOfStrings;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Todor Popov using Lenovo on 1.3.2017 г. at 19:37.
 */
public class StackOfStrings {

    private List<String>  data;

    public StackOfStrings(){
        this.data=new ArrayList<>();
    }

    public void push(String element){
        this.data.add(element);
    }

    public String peek(){
      return this.data.get(data.size()-1);
    }

    public String pop(){
        String element=this.peek();
        this.data.remove(this.data.size()-1);
                return element;
    }
    public boolean isEmpty(){
        return  this.data.isEmpty();
    }






}
