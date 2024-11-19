package org.example;

/*This is the concrete class for the party factory.  It implements the
GarmentFactory interface, and includes implementation for all the methods*/
public class PartyFactory implements GarmentFactory{

    @Override
    public Tops offerTop(){
        return new PartyTops();

    }

    @Override
    public Pants offerPants(){
        return new PartyPants();

    }

    @Override
    public Shoes offerShoes(){
        return new PartyShoes();

    }

}
