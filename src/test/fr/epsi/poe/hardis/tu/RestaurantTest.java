package fr.epsi.poe.hardis.tu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Yannis Mazzer <yannis@ioweb.fr>
 * @created_on 28/02/2017
 */
class RestaurantTest {

    public static final String VALID_PHONE_NUMBER = "+336123456789";
    public static final String INVALID_PHONE_NUMBER = "06123456789";
    private Restaurant _restaurant;

    @BeforeEach
    public void setup() {
        _restaurant = new Restaurant();
        _restaurant.setPhone("+33612346789");
    }

    @Test
    public void testThatRestaurantIsOpenByDefault() {

        /*
         * Arrange
         * Créer le contexte d'exécution
         * Autrement dit : Créer les objets nécessaires à l'exécution du
         * test
         */

         Restaurant restaurant = new Restaurant();

        /*
         * Act
         * Action sur l'objet testé : Je vérifie que le restaurant est ouvert
         */
        boolean state = restaurant.isOpen();

        // Assert

        Assertions.assertTrue(state);

    }

    @Test
    public void testThatValidPhoneNumberIsCorrectlySavedInModel() {
        // Arrange
        Restaurant restaurant = new Restaurant();

        // Act
        restaurant.setPhone(VALID_PHONE_NUMBER);

        // Assert
        Assertions.assertEquals(VALID_PHONE_NUMBER, restaurant.getPhone(), "");

    }


    @Test
    public void testThatInvalidPhoneNumberIsNotSavedInModel() {
        // Arrange
        Restaurant restaurant = new Restaurant();

        // Act
        restaurant.setPhone(INVALID_PHONE_NUMBER);

        // Assert
        Assertions.assertNotEquals(INVALID_PHONE_NUMBER, restaurant.getPhone(), "");
    }


    @Test
    public void testThatCorseIsOk() {

    }
}