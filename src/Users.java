import java.util.*;

public class Users {
    Users(Integer numberOfUsers){
        this.numberOfUsrs = numberOfUsers;
        this.users = new String[numberOfUsrs];
        this.usersDict = new HashMap<String, Integer>();

    }
    private Integer numberOfUsrs;
    private String[] users;
    private Map<String, Integer> usersDict;

    public void addUsers (String user, Integer index){
        this.users[index] = user;
        if (this.usersDict.containsKey(user)){
            Integer userRep = this.usersDict.get(user);
            this.usersDict.put(user, ++userRep );
        } else {
            this.usersDict.put(user, 1);
        }
    }
    public void printOccurences(){
        //System.out.println(Arrays.asList(usersDict));
        System.out.println("Name occurences:");
        for(String user: usersDict.keySet()){
            System.out.println("    "+user+ " ("+usersDict.get(user).toString()+") ");
        }
    }
    private boolean letterOccurence(String name){
        String  nameLower  = name.toLowerCase();
        for(int i =0; i<nameLower.length(); i++){
            String  c = Character.toString(nameLower.toCharArray()[i]);
            String occurence   =  new StringBuilder(nameLower).deleteCharAt(i).toString();
           if (occurence.contains(c)) return  true;
        }

        return false;
    }
    public void printLetterOccurence(){
        System.out.println("Does any letter occur more than once?");
        for (String usr: users){
            System.out.println(usr+" "+letterOccurence(usr));
        }
    }
}
