

public class MyArrayIntegerList implements MyIntegerList {
    private final int INIT_SIZE = 16;
    private final int CUT_RATE = 4;
    private Object[] array = new Object[INIT_SIZE];
    private int pointer = 0;
    private void resize(int newLength) { //доп массив если переполниться другой
        Object[] newArray = new Object[newLength];
        System.arraycopy(array, 0, newArray, 0, pointer);
        array = newArray;
    }
    @Override
    public void add(Integer value) {
        if(pointer == array.length-1)
            resize(array.length*2); // увеличу в 2 раза, если достигли границ
        array[pointer++] = value;
    }

    @Override
    public Integer get(int index) {

        return (Integer) array[index];
    }

    @Override
    public int find(Integer value) {
        return 0;
    }

    @Override
    public MyIntegerList sort() {
        return null;
    }

    @Override
    public void addFirst(Integer value) {

    }

    @Override
    public void addLast(Integer value) {

    }

    @Override
    public Integer remove(int index) {
        return null;
    }

    @Override
    public void print() {

    }
}
