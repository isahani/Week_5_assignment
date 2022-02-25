package edu.wctc;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Last Name >> ");
        String lastname = keyboard.nextLine();
        System.out.println("First Name >> ");
        String firstname = keyboard.nextLine();
        System.out.println(" Middle Initial >> ");
        String midddleInitial = keyboard.nextLine();
        System.out.println("Month of birth (1-12) >> ");
        int monthOfBirth = keyboard.nextInt();
        System.out.println("Day of birth (1-31) >> ");
        int dayOfBirth = keyboard.nextInt();
        System.out.println("Year of birth (yyyy) >> ");
        int yearOfBirth = keyboard.nextInt();
        System.out.println("Gender (M/F) >> ");
        char gender = keyboard.next().charAt(0);


        DriversLicense dl = new DriversLicense();
        try {
            FirstNameUtility fn = new FirstNameUtility();
            Integer FFF = fn.encodeFirstName(firstname, midddleInitial);
            dl.setFFF(FFF);
        } catch (MissingNameException e) {
            e.printStackTrace();
        }

        try {
            LastNameUtility ln = new LastNameUtility();
            String SSSS = ln.encodeLastName(lastname);
            dl.setSSSS(SSSS);
        } catch (MissingNameException e) {
            e.printStackTrace();
        }
        try {
            MonthDayGenderUtility md = new MonthDayGenderUtility();
            Integer DDD = md.encodeMonthDayGender(yearOfBirth, monthOfBirth, dayOfBirth, gender);
            dl.setDDD(DDD);
        } catch (UnknownGenderCodeException e) {
            e.printStackTrace();
        } catch (InvalidBirthdayException e) {
            e.printStackTrace();
        }

        String YY = Integer.toString(yearOfBirth).substring(2);
        dl.setYY(Integer.parseInt(YY));
        dl.setNN(00);
        WisconsinFormatter wf = new WisconsinFormatter();
        Floridaformatter ff = new Floridaformatter();
        System.out.println(wf.formatLicenseNumber(dl));
        System.out.println(ff.formatLicenseNumber(dl));

    }
}
