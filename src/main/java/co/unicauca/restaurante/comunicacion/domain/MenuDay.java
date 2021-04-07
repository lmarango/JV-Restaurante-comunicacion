package co.unicauca.restaurante.comunicacion.domain;

public class MenuDay {

    TypeDay atrDay;  
    public MenuDay() {
    }

    public MenuDay(TypeDay atrDay) {
        this.atrDay = atrDay;
    }

    public TypeDay getAtrDay() {
        return atrDay;
    }

    public void setAtrDay(TypeDay atrDay) {
        this.atrDay = atrDay;
    }

}
