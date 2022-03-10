public class Test {
    public static void main(String[] args) {
        Elecrocar elecrocar = new Elecrocar(1);
        elecrocar.start();
        Elecrocar.Battery battery = new Elecrocar.Battery();
        battery.charge();
    }
}
