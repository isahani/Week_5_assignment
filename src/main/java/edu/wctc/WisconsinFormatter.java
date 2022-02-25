package edu.wctc;

public class WisconsinFormatter implements DriversLicenseFormatter{

    public String formatLicenseNumber (DriversLicense driversLicense){
        //code
        String yy = Integer.toString((driversLicense.getYY()));
        Character y1 = yy.charAt(0);
        Character y2 = yy.charAt(1);
        return driversLicense.getSSSS() + "-" + driversLicense.getFFF() + y1 + "-" + y2 + driversLicense.getDDD() + "-" + driversLicense.getNN();
    }

}
