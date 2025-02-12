//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(getNumber1());
        System.out.println(getNumber2());
    }
    public static int getNumber1() {
        long timestamp = System.currentTimeMillis();
        return (int)(timestamp % 9);
    }
    public static int getNumber2() {
        int num = (int)(System.nanoTime() % 9);
        return num;
    }
}