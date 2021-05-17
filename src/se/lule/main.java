package se.lule;


public class main {

    public static void main(String[] args) {


        googleSearch google = new googleSearch();
        google.DoSearch();

        actitime actitimeFill = new actitime();
        actitimeFill.DoFill();

        adlibris adlibrisFill = new adlibris();
        adlibrisFill.DoFill();


    }
}
