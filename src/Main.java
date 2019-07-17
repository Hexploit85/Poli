 class Car{
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;

    public Car(int cylinders,String name){
        this.engine = true;
        this.cylinders= cylinders;
        this.wheels = 4;
        this.name = name;
        }

     public boolean getEngine() {
         return engine;
     }

     public int getCylinders() {
         return cylinders;
     }

     public int getWheels() {
         return wheels;
     }

     public String getName() {
         return name;
     }


     public String startEngine(){
         return "Engine is running";
     }

     public String accelerate(){
         return "Zapierdala jak przeciag";
     }

     public String stop(){
         return "Zatrzymujemy sie";
     }
 }

 class Polonez extends Car{
     public Polonez() {
         super(4,"Poldek");
     }

     @Override
     public String startEngine() {
         return "Poldek uruchomil silnik wrumbrumbrum";
     }
 }

 class Maluch126p extends Car{
    public Maluch126p(){
        super(8,"maluch");
    }

    @Override
     public String stop(){
        return "Maluch wykonuje chamowanie";
    }
 }

class Porshe extends Car{
    public Porshe(){
        super(16,"porszak");
    }
}




public class Main {
    public static void main(String[] args) {

        for(int i = 0; i<5; i++){
            Car car = randomCar();
            System.out.println(car.getName());
            System.out.println(car.startEngine());
            System.out.println(car.accelerate());
            System.out.println(car.stop());
            System.out.println(" ");
        }
    }


    public static Car randomCar() {
        int randomNumber = (int) (Math.random() * 3) + 1;

        switch (randomNumber) {
            case 1:
                return new Polonez();
            case 2:
                return new Maluch126p();
            case 3:
                return new Porshe();
        }
        return null;
    }

}