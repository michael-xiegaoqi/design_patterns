package com.henser.behavioralPatterns.iterator.intrinsicIterator;

/**
 * 具体聚集角色类，实现了抽象聚集角色所要求的接口，也就是createIterator()方法。
 * 此外，聚集类有一个内部成员类ConcreteIterator，这个内部类实现了抽象迭代子角色所规定的接口；
 * 而工厂方法createIterator()所返还的就是这个内部成员类的实例
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

        return new ConcreteIterator();
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

    /**
     * 内部成员类，具体迭代子类
     */
    private class ConcreteIterator implements Iterator
    {
        //内部索引，记录当前迭代到的索引位置
        private int index = 0;
        //记录当前聚集对象的大小
        private int size = 0;
        /**
         * 构造函数
         */
        public ConcreteIterator(){

            this.size = objArray.length;
            index = 0;
        }
        /**
         * 迭代方法：返还当前元素
         */
        @Override
        public Object currentItem() {
            return objArray[index];
        }
        /**
         * 迭代方法：移动到第一个元素
         */
        @Override
        public void first() {

            index = 0;
        }
        /**
         * 迭代方法：是否为最后一个元素
         */
        @Override
        public boolean isDone() {
            return (index >= size);
        }
        /**
         * 迭代方法：移动到下一个元素
         */
        @Override
        public void next() {

            if(index < size)
            {
                index ++;
            }
        }
    }

}
