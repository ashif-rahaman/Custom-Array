package Util;

public class ArrayBuilder {

    private int size = 1;
    private int index = 0;

    private Object[] obj = new Object[size];
    private Object[] objCopy;

    public void increment() {

        int i = 0;
        objCopy = obj;

        this.obj = new Object[++size];

        for (Object object : objCopy) {
            obj[i++] = object;
        }
    }

    public void addObjects(Object obj) {

        if (this.index == size) {
            increment();
        }
        this.obj[index++] = obj;
    }

    public void display() {
        for (Object ob : obj) {
            System.out.println(ob);
        }
    }

    public Object getItem(int index) {
        if (this.size <= index) {
            return null;
        }

        return this.obj[index];
    }

}
