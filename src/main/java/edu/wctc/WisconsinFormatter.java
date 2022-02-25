package edu.wctc;

public class WisconsinFormatter implements DriversLicenseFormatter{

    public String formatLicenseNumber (DriversLicense driversLicense){
        //code
        String yy = Integer.toString((dl.getYY()));
        //System.out.println(yy);
        Character y1 = yy.charAt(0);
        Character y2 = yy.charAt(1);
        return dl.getSSSS() + "-" + dl.getFFF() + y1 + "-" + y2 + dl.getDDD() + "-" + dl.getNN();
    }

}
