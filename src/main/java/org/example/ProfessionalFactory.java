package org.example;

/*This is the concrete class for the professional factory.  It implements the
GarmentFactory interface, and includes implementation for all the methods*/
public class ProfessionalFactory implements GarmentFactory{

    @Override
    public Tops offerTop(){
        return new ProfessionalTops();

    }

    @Override
    public Pants offerPants(){
        return new ProfessionalPants();

    }

    @Override
    public Shoes offerShoes(){
        return new ProfessionalShoes();

    }

}
