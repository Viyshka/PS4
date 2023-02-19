public class MyArrayIntegerList implements MyIntegerList {
    private int[] a;
    private  int nElems;


    public MyArrayIntegerList(int size){
        a = new int[size];
    }
    @Override
    public void add(Integer value) {
        a[nElems] = value;
        nElems++;
    }

    @Override
    public Integer get(int index) {

        return null;
    }

    @Override
    public int find(Integer value) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {

            }
            return i;
        }
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
