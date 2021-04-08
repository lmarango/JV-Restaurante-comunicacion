package co.unicauca.restaurante.comunicacion.domain;

public class DayMenu {
    int dmenID;
    String dmenDay;  
    String resID; 
    public DayMenu() {
    }

    public DayMenu(int dmenID, String dmenDay, String resID) {
        this.dmenID = dmenID;
        this.dmenDay = dmenDay;
        this.resID = resID;
    }
    
    public int getDmenID() {
        return dmenID;
    }

    public void setDmenID(int dmenID) {
        this.dmenID = dmenID;
    }

    public String getDmenDay() {
        return dmenDay;
    }

    public void setDmenDay(String dmenDay) {
        this.dmenDay = dmenDay;
    }

    public String getResID() {
        return resID;
    }

    public void setResID(String resID) {
        this.resID = resID;
    }

}
