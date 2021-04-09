package co.unicauca.restaurante.comunicacion.domain;

/**
 *
 * @author juanj
 */
public class Componente  {
    private int compId;
    
    private String compNombre;
  
    private int precio;
    
    private String Tipo;
    
    private byte [] CompImage;
    
    public Componente(){}

    public Componente(int compId, String compNombre, int precio, String Tipo, byte[] CompImage) {
        this.compId = compId;
        this.compNombre = compNombre;
        this.precio = precio;
        this.Tipo = Tipo;
        this.CompImage = CompImage;
    }

    public int getCompId() {
        return compId;
    }

    public void setCompId(int compId) {
        this.compId = compId;
    }

    public String getCompNombre() {
        return compNombre;
    }

    public void setCompNombre(String compNombre) {
        this.compNombre = compNombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public byte[] getCompImage() {
        return CompImage;
    }

    public void setCompImage(byte[] CompImage) {
        this.CompImage = CompImage;
    }
    
    

}