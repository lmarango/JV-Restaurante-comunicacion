package co.unicauca.restaurante.comunicacion.domain;

public class DayMenu {
    int dmenID;
    TypeDay atrDay;  
    public DayMenu() {
    }

    public DayMenu(int dmenID, TypeDay atrDay) {
        this.dmenID = dmenID;
        this.atrDay = atrDay;
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
