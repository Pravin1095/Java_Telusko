package Java_Core.BasicCode.StringProblems;

import java.util.Locale;

public class EmailValidator {

    public boolean isValidEmail(String email){
String trimmedEmail = email.trim().toLowerCase();

        int indexAmp = trimmedEmail.indexOf('@');
        int lastIndAmp = trimmedEmail.lastIndexOf('@');
        int lastIndexDot = trimmedEmail.lastIndexOf('.');
//        System.out.println(indexAmp);
//        System.out.println(trimmedEmail.lastIndexOf('@'));

        if(indexAmp==-1 || indexAmp!=lastIndAmp || lastIndAmp>lastIndexDot){
            return false;
        }

return true;
    }
}
