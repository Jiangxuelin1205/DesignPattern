package Creational.Prototype;

public abstract class Shape implements Cloneable {

    String id;
    String type;

    abstract void draw();

    public Object clone() {// 实现复制现有实例来生成新实例的方法（也可以由超类完成）
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}

