package org.example;

/*Abstract factory defines and interface for creating all distinct products, but
  leaves the actual product creation to concrete factory classes.
  Each factory type, ProfessionalFactory, PartyFactory, CasualFactory, corresponds to a certain product variety*/

/**
 *
 * @author NicholasPapazis
 */
public interface GarmentFactory {

    Tops offerTop();
    Pants offerPants();
    Shoes offerShoes();

}
