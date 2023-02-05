public class Drive {
    private String type; //Тип диска DvD или Блюрай с игрой
    public Drive(String type) {
        this.type = type;
        startDrive();
    }
    public void startDrive() {
        if (type == "Диск с игрой") {
            System.out.println("Игра запускается");
        }
        else if (type == "DvD диск"){
            System.out.println("Фильм запускается");
        }
    }
}
