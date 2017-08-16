package GenericScale;

import jdk.nashorn.internal.ir.IfNode;

/**
 * Created by Todor Popov using Lenovo on 16.3.2017 г. at 16:54.
 */
public class Scale<T extends Comparable<T>>{
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    public T getHeavier(){

        if (this.left.compareTo(this.right)<0){
            return right;
        }

        if (this.left.compareTo(this.right)>0){
            return left;
        }

        return null;
    }
}
