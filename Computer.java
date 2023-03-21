package finalwork;

public class Computer {
    private int id;
    private String color;
    private String os;
    private int op;
    private int ssd;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs() {
        return os;
    }

    public void setOp(int op) {
        this.op = op;
    }

    public int getOp() {
        return op;
    }

    public void setSsd(int ssd) {
        this.ssd = ssd;
    }

    public int getSsd() {
        return ssd;
    }

    public Computer(int id, String color, String os, int op, int ssd){
        this.id = id;
        this.color = color;
        this.os = os;
        this.op = op;
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Ноутбук: " + id + " цвет: " + color + ". Характеристики: " + os + " " + op + " " + ssd;
    }
}
