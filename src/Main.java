import java.util.HashSet;
import java.util.Set;

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
        /*
        Car car = new Car();
        car.name = "Opel";
        car.maxSpeed = 200;
        System.out.println(car.getMaxSpeed());
        car.increaseSpeed(10);
        System.out.println(car.getCurrentSpeed());
        car.driveWithSpeed(150);
        System.out.println(car.getCurrentSpeed());
        */

        //comparing strings
        /*
        String s1 = "INFOShare";
        String s2 = new String ("infoShare");
        System.out.println(s2.equals(s1));
        System.out.println(s1.compareTo(s2));
        System.out.println(s2.compareTo(s1));
        System.out.println(s2.compareToIgnoreCase(s1));
        */

        //stringBuilder
        /*
        String s3 = "info" + "Share" + "Acaddemy";

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("info");
        stringBuilder.append("Share");
        stringBuilder.append("Academy");

        String s4 = stringBuilder.toString();
        String s5 = stringBuilder.reverse().toString();
        System.out.println("Result from stringBuilder: " + s4);
        System.out.println("Reversed string from stringBuilder: " + s5);
        */

        //Methods
        /*
        String s = "string:separate:by:colons";
        String[] sArray = s.split(":");

        System.out.println("Size of a string table: " + sArray.length);
        for (int i =0; i< sArray.length; i++){
            System.out.println("El " + i + ": " + sArray[i]);
            */

        //Tables
        /*
        int[] tab = new int[3];
        int[] tab2 = {1,2,3};

        int num = tab[1];
        int num2 = tab2[1]

        System.out.println(num1);
        System.out.println(tab2[1]);*/

        //

        Menu newObj = new Menu();
        newObj.fillTable(3);

        //Sets
        Set<String> zbior = new HashSet<String>();
        zbior.add("first");
        zbior.add("second");
        zbior.add("first");
        zbior.add("second");
        zbior.add("1");
        for (String ciagZnakow : zbior) {
            System.out.println(ciagZnakow);
        }

    }
}



