public class Main {
    public static void main(String[] args) {
        /*
        System.out.println("Hello");
        System.out.print("hey");
        System.out.println("Hi");

        int a = 10, b = 5, sum = a + b;

        System.out.println(sum);
        b = 10;
        sum = a + b;
        System.out.println(sum);
        b = 13;
        sum = a + b;
        System.out.println(sum);
        b = 17;
        sum = a + b + 5;
        System.out.println(sum);

        Menu myMenu = new Menu();
        Menu mySecondMenu = new Menu(55);
        Menu myOtherMenu = new Menu ("here some text");

        System.out.println("Number: " + myMenu.number + " Text: " + myMenu.text);

        myMenu.number = 7;
        System.out.println(myMenu.number);
        System.out.println("Number with provided arg: " + mySecondMenu.number);
        System.out.println("Text of myOtherMenu: " + myOtherMenu.text);
        */
        Car car = new Car();
        car.name = "Opel";
        car.maxSpeed = 200;
        System.out.println(car.getMaxSpeed());
        car.increaseSpeed(10);
        System.out.println(car.getCurrentSpeed());
        car.driveWithSpeed(150);
        System.out.println(car.getCurrentSpeed());

    }
}
