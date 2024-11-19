package org.example;

public class DriverClass {

    private static Application configureApplication() {

        //create an instance of Application
        Application app;
        //create an instance of GarmentFactory
        GarmentFactory factory;

        String printOutfit = "party"; //this will determine what category of outfit, party, professional, casual, will be offered to the user.

        //checks the outfit category
        if(printOutfit.contains("professional")){
            factory = new ProfessionalFactory(); //create new instance of ProfessionalFactory if category is professional
            app = new Application(factory); //assign app to new instance
        }
        else if(printOutfit.contains("party")){
            factory = new PartyFactory(); //create new instance of PartyFactory if category is party
            app = new Application(factory); //assign app to new instance
        }
        else{
            factory = new CasualFactory(); //create new instance of CasualFactory if category is casual
            app = new Application(factory); //assign app to new instance
        }

        return app; //returns the Application object with the correct garments

    }

    public static void main(String[] args) {
        Application app = configureApplication(); //assigns app to a new instance of configureApplication
        app.revealContent(); //prints the offered garments
    }


}
