public class Validator {
    public static boolean isValidMobileNumber(String mobileNumber) {
        mobileNumber = mobileNumber.trim();
        // Indian mobile number pattern with 10 digits starting from 6-9 and with country code optional and spaces and hyphens allowed and parentheses around area code optional and 0 prefix optional
        String regex = "^(\\+91[\\-\\s]?|0)?[6-9]\\d{9}$";
        return mobileNumber.matches(regex);
        
    }
}