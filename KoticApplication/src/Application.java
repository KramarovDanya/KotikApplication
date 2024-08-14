import model.Kotik;

public class Application {
    public static void main(String[] args) {
        Kotik kisa = new Kotik();
        Kotik kot = new Kotik("Рома", 7, "Мяу");

        kot.liveAnotherDays();
        System.out.println();
        System.out.println("Мое имя " + kot.getName());
        System.out.println("Мой вес " + kot.getWeight() + " кг\n");
        if (kot.getMeow().equals(kisa.getMeow())){
            System.out.println("Котики говорят одинаково");
        }
        else {
            System.out.println("Котики мяукают по разному");
        }
        System.out.println("Создано " + kot.getNumberOfKotikov() + " котов");



    }
}
