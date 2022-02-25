package edu.wctc;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.ResolverStyle;

public class MonthDayGenderUtility {

    private final int MOD_MALE = 0;
    private final int MOD_FEMALE = 500;
    private final char CODE_MALE = 'M';
    private final char CODE_FEMALE = 'F';
    private int genderModConstant = 0;

    public int encodeMonthDayGender(int year, int month, int day, char genderCode) throws UnknownGenderCodeException, InvalidBirthdayException {
        if ((Character.compare(genderCode,'M') != 0) && (Character.compare(genderCode,'F') != 0)) {
            throw new UnknownGenderCodeException(genderCode);
        }
        if (genderCode == 'F'){
            genderModConstant = MOD_FEMALE;
        }
        String date = Integer.toString(year) + '-' + Integer.toString(month) + '-' + Integer.toString(day);

        LocalDate.parse(date, DateTimeFormatter.ofPattern("uuuu-M-d").withResolverStyle(ResolverStyle.STRICT));

        return ((month - 1) * 40 + day + genderModConstant);

    }
}
