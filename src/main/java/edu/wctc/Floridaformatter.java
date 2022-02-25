package edu.wctc;

public class Floridaformatter implements DriversLicenseFormatter{

    public String formatLicenseNumber(DriversLicense driversLicense){
        //code
        String nn = Integer.toString(dl.getNN());
        Character n = nn.charAt(0);
        return dl.getSSSS() + "-" + dl.getFFF() + "-" + dl.getYY() + dl.getDDD() + "-" + n;
    }
}
