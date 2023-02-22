public class Main {
    public static void main(String[] args) {
        //Ps4slim Ps4 = new Ps4slim(new Body.Cpu(8,1.6), new Gpu(8,36),new Hdd(16,"dasd"), new Ram(8, 9), new Drive("DvD диск"));
        MyIntegerList list= new MyArrayIntegerList();
        list.add(16);
        list.add(25);
        System.out.println(list.get(0));
    }
}