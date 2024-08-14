package model;
import java.util.Scanner;
public class Kotik {
    private int satiety; //отвечает за сытость
    private int prettiness = 11;
    private String meow = "рррр";
    private String name = "no name";
    private int weight = 5;
    private static int numberOfKotikov;
    private int daysOfLife = 1;  //отвечает за количество дней

    public Kotik(String name, int weight, String meow){ //конструктор котика с параметрами
        setName(name);
        setWeight(weight);
        setMeow(meow);
        numberOfKotikov += 1;
    }
    public Kotik(){ //конструктор котика пустой
        setKotik(10, "Котище", 6, "мур");
        numberOfKotikov += 1;
    }
    public void setKotik(int prettiness, String name, int weight, String meow){
        this.prettiness = prettiness;
        this.name = name;
        this.weight = weight;
        this.meow = meow;
    }
    public void setMeow(String meow){
        this.meow = meow;
    }
    public void setName(String name){ //сеттер имени
        this.name = name;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
    public String getName(){
        return name;
    }
    public  int getWeight(){
        return weight;
    }
    public String getMeow(){
        return meow;
    }
    public int getNumberOfKotikov(){
        return numberOfKotikov;
    }


    private boolean play(){ //шаблон для остальных методов
        if (this.satiety > 0){
            this.satiety -= 1;
            System.out.println("Я играю");

            return true;
        }
        else {
            System.out.println("Хочу кушать(");
            return false;
        }
    }
    private boolean sleep(){ //шаблон для остальных методов
        if (this.satiety > 0){
            this.satiety -= 1;
            System.out.println("Я сплю");
            return true;
        }
        else {
            System.out.println("Хочу кушать(");
            return false;
        }
    }
    private boolean chaseMouse(){ //шаблон для остальных методов
        if (this.satiety > 0){
            this.satiety -= 1;
            System.out.println("Я ловлю мыш");
            return true;
        }
        else {
            System.out.println("Хочу кушать(");
            return false;
        }
    }
    private boolean running(){ //шаблон для остальных методов
        if (this.satiety > 0){
            this.satiety -= 1;
            System.out.println("Я отдыхаю");
            return true;
        }
        else {
            System.out.println("Хочу кушать(");
            return false;
        }
    }
    private boolean sharpening(){ //шаблон для остальных методов
        if (this.satiety > 0){
            this.satiety -= 1;
            System.out.println("Я точу когти");
            return true;
        }
        else {
            System.out.println("Хочу кушать(");
            return false;
        }
    }
    private boolean eat(int amountOfFood){ //метод добавляет сытость (перегрузка с количетсвом еды)
        this.satiety += amountOfFood;
        System.out.println("Я покушал!");
        return true;
    }
    private boolean eat(int amountOfFood, String nameOfFood){ //метод добавляет сытость (перегрузка с названием еды)
        this.satiety += amountOfFood;
        System.out.println("Я покушал!");
        return true;
    }
    private boolean eat(){ //метод добавляет сытость (перегрузка без параметров)
        Scanner in = new Scanner(System.in);
        System.out.println("Название еды?");
        String nameOfFood = in.nextLine();
        System.out.println("Сколько единиц еды ?");
        int amountFooD = in.nextInt();
        eat(amountFooD, nameOfFood);
        return true;
    }

    public boolean liveAnotherDays(){ //метод итераций дней
        while (daysOfLife < 25){
            System.out.println("Живу " + daysOfLife + " день");
            chooseMethod();
            daysOfLife += 1;
        }
        return true;
    }
    private void chooseMethod(){ //метод рандомно выбирает что будет делать котик
        if (satiety > 0){
            RandomRng rand = new RandomRng();
            int methodKotika = rand.randomInARange(1, 5);
            switch (methodKotika){
                case 1: play();
                    break;
                case 2: sleep();
                    break;
                case 3: chaseMouse();
                    break;
                case 4: running();
                    break;
                case 5: sharpening();
                    break;

            }
        }
        else{
            System.out.println("Что-то я проголодался, пойду поем");
            eat(5);
        }

    }

}
