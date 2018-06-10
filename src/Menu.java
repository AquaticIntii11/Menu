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

    public void fillTable (int num){
        int minNum = num;
        int[] tab = new int[10];
        for (int i=0; i < tab.length; i++){
            tab[i] = minNum;
            minNum+=1;
        }
        for (int i=0; i < tab.length; i++){
            System.out.println(tab[i]);
        }

    }
}

