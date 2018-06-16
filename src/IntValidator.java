public class IntValidator {
    public static boolean ValidateInt(String input){
        try {
            int intNum = Integer.parseInt(input);
        }
        catch(NumberFormatException nfe)
        {
            return false;
        }
        return true;
    }
}
