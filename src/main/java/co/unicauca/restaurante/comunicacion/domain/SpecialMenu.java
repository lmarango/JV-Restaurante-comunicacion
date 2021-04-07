
package co.unicauca.restaurante.comunicacion.domain;

/**
 *
 * @author LUIS ARANGO
 */
public class SpecialMenu {
    private TypeDay atrDay;

    public SpecialMenu(TypeDay atrDay) {
        this.atrDay = atrDay;
    }

    public TypeDay getAtrDay() {
        return atrDay;
    }

    public void setAtrDay(TypeDay atrDay) {
        this.atrDay = atrDay;
    }
    
}
