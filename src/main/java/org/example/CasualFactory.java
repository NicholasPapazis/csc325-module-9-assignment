package org.example;

/*This is the concrete class for the casual factory.  It implements the
GarmentFactory interface, and includes implementation for all the methods*/
public class CasualFactory implements GarmentFactory {

    @Override
    public Tops offerTop(){
        return new CasualTops();

    }

    @Override
    public Pants offerPants(){
        return new CasualPants();

    }

    @Override
    public Shoes offerShoes(){
        return new CasualShoes();

    }

}
