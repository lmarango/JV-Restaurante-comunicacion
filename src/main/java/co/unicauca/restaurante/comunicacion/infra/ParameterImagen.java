package co.unicauca.restaurante.comunicacion.infra;

/**
 *
 * @author TATIANA TOQUICA
 */
public class ParameterImagen {
    private String name;
    private byte[] value;

    public ParameterImagen(String name, byte[] value) {
        this.name = name;
        this.value = value;
    }

    
    public ParameterImagen() {
    }

    public String getName() {
        return name;
    }

    public byte[] getValue() {
        return value;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setValue(byte[] value) {
        this.value = value;
    }
    
}
