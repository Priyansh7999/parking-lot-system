public class Validator {
    public static boolean isValidMobileNumber(String mobileNumber) {
        mobileNumber = mobileNumber.trim();
        if(mobileNumber.isEmpty()){
            return false;
        }
        String regex = "^(\\+91[\\-\\s]?)?[0]?(91)?[789]\\d{9}$";
        return mobileNumber.matches(regex);

    }
    public static boolean isValidPersonName(String name) {
        name = name.trim();
        if(name.isEmpty()){
            return false;
        }
        String regex = "^[a-zA-Z\\s]+$";
        return name.matches(regex);
        
    }
    public static boolean isValidFloorInput(String number) {
        number = number.trim();
        if(number.isEmpty()){
            return false;
        }
        String regex = "^[0-9]+$";
        boolean isValidFloorInput = number.matches(regex);
        if(isValidFloorInput){
            int floorNumber = Integer.parseInt(number);
            return floorNumber >= 1 && floorNumber <= 10;
        } else {
            return false;
        }
    }
    public static boolean isValidSlotInput(String number) {
        number = number.trim();
        if(number.isEmpty()){
            return false;
        }
        String regex = "^[0-9]+$";
        boolean isValidSlotInput = number.matches(regex);
        if(isValidSlotInput){
            int slotNumber = Integer.parseInt(number);
            return slotNumber >= 1 && slotNumber <= 1000;
        } else {
            return false;
        }
    }

}