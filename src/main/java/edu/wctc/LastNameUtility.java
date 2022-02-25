package edu.wctc;
import org.apache.commons.codec.language.Soundex;


public class LastNameUtility {
    private Soundex soundex = new Soundex();
    public String encodeLastName(String lastname) throws MissingNameException {
        if (lastname.equals(null)) {
            throw new MissingNameException(lastname);
        }
        String encoding = soundex.encode(lastname);
        return encoding;
    }
}
