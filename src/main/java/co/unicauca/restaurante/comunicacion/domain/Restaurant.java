package co.unicauca.restaurante.comunicacion.domain;

public class Restaurant {
    // <editor-fold defaultstate="collapsed" desc="Atributos">
    /**
     * Identificador del restaurante
     */
    private String resID;
    /**
     * Nombre del administrador
     */
    //private String userName;
    /**
     * Nombre del restaurante
     */
    private String resName;
    /**
     * Dirección del restaurante
     */
    private String resAddress;
    /**
     * Descripción temática del restaurante (Vegetariano, gourmet,etc)
     */
    private String resDescFood;
    // </editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Constructores">
    /**
     * Constructor parametrizado de la clase Restaurant
     * @param resID ID del restaurante
     * @param userName Nombre Administrador
     * @param resName Nombre del Restaurante
     * @param resAddress Dirección del restaurante
     * @param resDescFood Descripción de la temática
     */
    public Restaurant(String resID, /**String userName,*/ String resName, String resAddress, String resDescFood) {
        this.resID = resID;
    //    this.userName = userName;
        this.resName = resName;
        this.resAddress = resAddress;
        this.resDescFood = resDescFood;
    }
    /**
     * Constructor no parametrizado por default
     */
    public Restaurant() {}
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Getters">
    /**
     * Obtiene el identificador de un restaurante
     * @return String resID
     */
    public String getResID() {
        return resID;
    }
    /**
     * Obtiene el nombre del administrador
     * @return String userNamer
     */
    //public String getUserName() {
    //    return userName;
    //}
    /**
     * Obtiene el nombre del restaurante
     * @return String resName
     */
    public String getResName() {
        return resName;
    }
    /**
     * Obtiene la dirección del restaurante
     * @return String resAddress
     */
    public String getResAddress() {
        return resAddress;
    }
    /**
     * Obtiene la descripción de la temática del restaurante
     * @return String resDescFood
     */
    public String getResDescFood() {
        return resDescFood;
    }
    //</editor-fold>
    //<editor-fold defaultstate="collapsed" desc="Setters">
    /**
     * Modifica el identificador de un restaurante
     * @param resID nuevo identificador
     */
    public void setResID(String resID) {
        this.resID = resID;
    }
    /**
     * Modifica el nombre del administrador del restaurante
     * @param userName nuevo nombre del administrador
     */
    //public void setUserName(String userName) {
    //    this.userName = userName;
    //}
    /**
     * Modifica el nombre del restaurante
     * @param resName 
     */
    public void setResName(String resName) {
        this.resName = resName;
    }
    /**
     * Modifica la dirección del restaurante
     * @param resAddress 
     */
    public void setResAddress(String resAddress) {
        this.resAddress = resAddress;
    }
    /**
     * Modifica la temática del restaurante
     * @param resDescFood 
     */
    public void setResDescFood(String resDescFood) {
        this.resDescFood = resDescFood;
    }
//</editor-fold> 
    
    //esto es una prueba.
}
