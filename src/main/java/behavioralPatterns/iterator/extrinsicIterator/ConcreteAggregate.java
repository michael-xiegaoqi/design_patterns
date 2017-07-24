package main.java.behavioralPatterns.iterator.extrinsicIterator;

/**
 * 具体聚集角色类，实现了抽象聚集角色类所要求的接口，也就是createIterator()方法。
 * 此外，还有方法getElement()向外界提供聚集元素，而方法size()向外界提供聚集的大小等。
 * Created by henser on 17-7-23.
 */
public class ConcreteAggregate extends Aggregate {

    private Object[] objArray = null;
    /**
     * 构造方法，传入聚合对象的具体内容
     */
    public ConcreteAggregate(Object[] objArray){
        this.objArray = objArray;
    }

    @Override
    public Iterator createIterator() {

        return new ConcreteIterator(this);
    }
    /**
     * 取值方法：向外界提供聚集元素
     */
    public Object getElement(int index){

        if(index < objArray.length){
            return objArray[index];
        }else{
            return null;
        }
    }
    /**
     * 取值方法：向外界提供聚集的大小
     */
    public int size(){
        return objArray.length;
    }

}
