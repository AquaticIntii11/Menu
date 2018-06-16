import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        //get a number of users
        int nameNumber = 0;
        boolean status = true;
        boolean correctInput = false;
        while(status) {
            System.out.println("Provide number of users");
            String input = in.nextLine();
            correctInput = IntValidator.ValidateInt(input);
            if (correctInput){
                status = false;
                nameNumber = Integer.parseInt(input);
            }
            else {
                System.out.println("Number of user should be integer :<");
            }
        }

        Users users = new Users(nameNumber);

        String shortestName = "";
        String longestName = "";
        //get users
        for(int i=0; i<nameNumber; i++){
            System.out.println(String.format("Provide %d user:", i+1));
            String tempString = in.nextLine();
            if (tempString.length() < shortestName.length() || i == 0){
                shortestName = tempString;
            }
            if (tempString.length() > longestName.length()){
                longestName = tempString;
            }
            users.addUsers(tempString, i);

        }
        System.out.println("Shortest name: "+shortestName);
        System.out.println("Longest name: "+longestName);
        users.printOccurences();
        users.printLetterOccurence();




    }
}



