
package co.unicauca.restaurante.comunicacion.domain;

/**
 *
 * @author LUIS ARANGO
 */
public class SpecialMenu {
    private int smenID;
    private String smenDay;
    private String resID;

    public SpecialMenu(int smenID, String smenDay, String resID) {
        this.smenID = smenID;
        this.smenDay = smenDay;
        this.resID = resID;
    }

    public SpecialMenu() {
    }

    public int getSmenID() {
        return smenID;
    }

    public void setSmenID(int smenID) {
        this.smenID = smenID;
    }

    public String getSmenDay() {
        return smenDay;
    }

    public void setSmenDay(String smenDay) {
        this.smenDay = smenDay;
    }

    public String getResID() {
        return resID;
    }

    public void setResID(String resID) {
        this.resID = resID;
    }
}
