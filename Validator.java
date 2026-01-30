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
    public static boolean isValidMobileNumber(String mobileNumber) {
        mobileNumber = mobileNumber.trim();
        if(mobileNumber.isEmpty()){
            return false;
        }
        String regex = "^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$";
        return mobileNumber.matches(regex);
    }
}