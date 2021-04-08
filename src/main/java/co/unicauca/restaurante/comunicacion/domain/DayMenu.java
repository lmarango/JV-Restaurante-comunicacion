package co.unicauca.restaurante.comunicacion.domain;

public class DayMenu {

    TypeDay atrDay;  
    public DayMenu() {
    }

    public DayMenu(TypeDay atrDay) {
        this.atrDay = atrDay;
    }

    public TypeDay getAtrDay() {
        return atrDay;
    }

    public void setAtrDay(TypeDay atrDay) {
        this.atrDay = atrDay;
    }

}
