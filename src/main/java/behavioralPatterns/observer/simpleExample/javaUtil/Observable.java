package main.java.behavioralPatterns.observer.simpleExample.javaUtil;

import java.util.Vector;

/**
 * 被观察者类都是java.util.Observable类的子类。
 * java.util.Observable提供公开的方法支持观察者对象，
 * 这些方法中有两个对Observable的子类非常重要：
 * 一个是setChanged()，
 * 另一个是notifyObservers()。
 * 第一方法setChanged()被调用之后会设置一个内部标记变量，代表被观察者对象的状态发生了变化。
 * 第二个是notifyObservers()，这个方法被调用时，会调用所有登记过的观察者对象的update()方法，使这些观察者对象可以更新自己。
 * Created by henser on 17-6-30.
 */
public class Observable {

    private boolean changed = false;
    private Vector obs;

    /** Construct an Observable with zero Observers. */

    public Observable() {
        obs = new Vector();
    }

    /**
     * 将一个观察者添加到观察者聚集上面
     */
    public synchronized void addObserver(Observer o) {
        if (o == null)
            throw new NullPointerException();
        if (!obs.contains(o)) {
            obs.addElement(o);
        }
    }

    /**
     * 将一个观察者从观察者聚集上删除
     */
    public synchronized void deleteObserver(Observer o) {
        obs.removeElement(o);
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    /**
     * 如果本对象有变化（那时hasChanged 方法会返回true）
     * 调用本方法通知所有登记的观察者，即调用它们的update()方法
     * 传入this和arg作为参数
     */
    public void notifyObservers(Object arg) {

        Object[] arrLocal;

        synchronized (this) {

            if (!changed)
                return;
            arrLocal = obs.toArray();
            clearChanged();
        }

        for (int i = arrLocal.length-1; i>=0; i--)
            ((Observer)arrLocal[i]).update(this, arg);
    }

    /**
     * 将观察者聚集清空
     */
    public synchronized void deleteObservers() {
        obs.removeAllElements();
    }

    /**
     * 将“已变化”设置为true
     */
    protected synchronized void setChanged() {
        changed = true;
    }

    /**
     * 将“已变化”重置为false
     */
    protected synchronized void clearChanged() {
        changed = false;
    }

    /**
     * 检测本对象是否已变化
     */
    public synchronized boolean hasChanged() {
        return changed;
    }

    /**
     * Returns the number of observers of this <tt>Observable</tt> object.
     *
     * @return  the number of observers of this object.
     */
    public synchronized int countObservers() {
        return obs.size();
    }

}
