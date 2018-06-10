public class Menu {
    int number;
    String text;

    public Menu(){
        number = 1;
        text = "some text";
    }

    public Menu (int number){
        this.number = number;
    }

    public Menu (String someString){
        this.text = someString;
    }

    public Menu (int number, String text){
        this.number = number;
        this.text = text;
    }
}
