package org.example;

/**
 *
 * @author NicholasPapazis
 */

//acts as a way to gather all the different garments using the GarmentFactory
public class Application {
    //Application to describe an outfit

    //private members
    private Tops top;
    private Pants pants;
    private Shoes shoes;

    //assigns values to member variables using GarmentFactory methods
    public Application(GarmentFactory garment) {
        top = garment.offerTop();
        pants = garment.offerPants();
        shoes = garment.offerShoes();
    }

    //prints the garment selection to the user
    public void revealContent()
    {
        top.offer();
        pants.offer();
        shoes.offer();
    }

}
