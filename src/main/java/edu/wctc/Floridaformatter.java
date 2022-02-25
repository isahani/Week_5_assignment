package edu.wctc;

public class Floridaformatter implements DriversLicenseFormatter{

    public String formatLicenseNumber(DriversLicense driversLicense){
        //code
        String nn = Integer.toString(driversLicense.getNN());
        Character n = nn.charAt(0);
        return driversLicense.getSSSS() + "-" + driversLicense.getFFF() + "-" + driversLicense.getYY() + driversLicense.getDDD() + "-" + n;
    }
}
