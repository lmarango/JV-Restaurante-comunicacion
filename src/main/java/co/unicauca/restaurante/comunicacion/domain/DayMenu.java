package co.unicauca.restaurante.comunicacion.domain;

public class DayMenu {
    int dmenID;
    TypeDay atrDay;  
    Restaurant resID; 
    public DayMenu() {
    }

    public Restaurant getResID() {
        return resID;
    }

    public void setResID(Restaurant resID) {
        this.resID = resID;
    }

    public DayMenu(int dmenID, TypeDay atrDay, Restaurant resID) {
        this.dmenID = dmenID;
        this.atrDay = atrDay;
        this.resID = resID;
    }

    public int getDmenID() {
        return dmenID;
    }

    public void setDmenID(int dmenID) {
        this.dmenID = dmenID;
    }

    public TypeDay getAtrDay() {
        return atrDay;
    }

    public void setAtrDay(TypeDay atrDay) {
        this.atrDay = atrDay;
    }
    
}
