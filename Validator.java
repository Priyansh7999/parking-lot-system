public class Validator {
    public static boolean isValidPersonName(String name) {
        name = name.trim();
        if(name.isEmpty()){
            return false;
        }
        if(name.length() > 20){
            return false;
        }
        String regex = "^[a-zA-Z\\s]+$";
        return name.matches(regex);
    }
}