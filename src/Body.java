public abstract class Body {
    private Cpu cpu;
    private Gpu gpu;
    private Hdd hdd;
    private Ram ram;
    private Drive drive;

    public Body(Cpu cpu, Gpu gpu, Hdd hdd, Ram ram, Drive drive) {
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.hdd = hdd;
        this.drive = drive;
    }

    static class Cpu {
        private int core;
        private double frequency;
        public Cpu(int core, double frequency) {
            this.core = core;
            this.frequency = frequency;
            whoConsel();
        }

         public void whoConsel() {
            if (core == 8 && frequency == 1.6) { // Можно ли обратиться к гпу а иммено к его частоте процессра и количеству блоков
                System.out.println("Это Ps4 слим");
            }
            else if (core == 8 && frequency == 2.1){
                System.out.println("Это Ps4 про");
            }
            else {
                System.out.println("Это вообще не Ps4");
            }
        }
    }
}
