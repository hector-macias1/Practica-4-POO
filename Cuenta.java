public class Cuenta {    
    private String nombre;
    private int PIN;
    private float saldo;

    public Cuenta(String nombre, int PIN, float saldo) {
        this.nombre = nombre;
        this.PIN = PIN;
        this.saldo = saldo;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /////////////////////////////////////////
    public int getPIN() {
        return PIN;
    }

    public void setPIN(int PIN) {
        this.PIN = PIN;
    }

    /////////////////////////////////////////
    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }    
    
}