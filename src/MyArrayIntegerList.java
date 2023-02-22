

public class MyArrayIntegerList implements MyIntegerList {
    private final int INIT_SIZE = 16;
    private Integer[] array = new Integer[INIT_SIZE];
    private int size = 0;
    private void resize(int newLength) { //доп массив если переполниться другой
        Integer[] newArray = new Integer[newLength];
        for (int i = 0; i < array.length; i++){
            array[i] = newArray[i];
        }
    }
    @Override
    public void add(Integer value) {
        if(size == array.length-1)
            resize(array.length*2); // увеличу в 2 раза, если достигли границ
        array[size++] = value;
    }

    @Override
    public Integer get(int index) {

        return array[index];
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
