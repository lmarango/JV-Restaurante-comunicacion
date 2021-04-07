package co.unicauca.restaurante.comunicacion.domain;

/**
 *
 * @author TATIANA TOQUICA
 */
public class Dish {
    // <editor-fold defaultstate="collapsed" desc="Atributos">
    /**
     * Identificador del plato especial
     */
    private int dishID;
    /**
     * Nombre del plato especial
     */
    private String dishName;
    /**
     * Descripción del plato especial
     */
    private String dishDescription;
    /**
     * Precio del plato especial
     */
    private double dishPrice;
    /**
     * array de bytes que representan la imagen del plato
     */
    private byte [] dishImage;
    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
     /**
     * Constructor no parametrizado por default
     */
    public Dish() {
    }
    /**
     * Constructor parametrizado de la clase Restaurant
     * @param dishID ID del plato
     * @param dishName Nombre del plato
     * @param dishDescription Descripción del plato
     * @param dishPrice Precio del plato
     * @param dishImage Imagen del plato
     */
    public Dish(int dishID, String dishName, String dishDescription, float dishPrice, byte[] dishImage) {
        this.dishID = dishID;
        this.dishName = dishName;
        this.dishDescription = dishDescription;
        this.dishPrice = dishPrice;
        this.dishImage = dishImage;
    }
    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * Obtiene el identificador de un plato
     * @return String dishID
     */
    public int getDishID() {
        return dishID;
    }
    /**
     * Obtiene el nombre de un plato
     * @return String dishName
     */
    public String getDishName() {
        return dishName;
    }
    /**
     * Obtiene la descripción de un plato
     * @return String dishDescription
     */
    public String getDishDescription() {
        return dishDescription;
    }
    /**
     * Obtiene el precio de un plato
     * @return String dishPrice
     */
    public double getDishPrice() {
        return dishPrice;
    }
    /**
     * Obtiene la imagen de un plato
     * @return String dishImage
     */
    public byte[] getDishImage() {
        return dishImage;
    }
    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    /**
     * Modifica el identificador de un plato
     * @param dishID nuevo identificador
     */
    public void setDishID(int dishID) {
        this.dishID = dishID;
    }
    /**
     * Modifica el nombre de un plato
     * @param dishName nuevo identificador
     */
    public void setDishName(String dishName) {
        this.dishName = dishName;
    }
    /**
     * Modifica la descripción de un plato
     * @param dishDescription nuevo identificador
     */
    public void setDishDescription(String dishDescription) {
        this.dishDescription = dishDescription;
    }
    /**
     * Modifica el precio de un plato
     * @param dishPrice nuevo identificador
     */
    public void setDishPrice(double dishPrice) {
        this.dishPrice = dishPrice;
    }
    /**
     * Modifica la imagen de un plato
     * @param dishImage nuevo identificador
     */
    public void setDishImage(byte[] dishImage) {
        this.dishImage = dishImage;
    }
    // </editor-fold>   
}
