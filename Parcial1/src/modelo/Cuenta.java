
package modelo;


public class Cuenta {
    private int numCuenta;
    private String tipoCuenta;
    private double saldoInicial;
    private double saldo;
    private Persona titular;

    public Cuenta() {
    }

    public Cuenta(int numCuenta, String tipoCuenta, double saldoInicial, double saldo, Persona titular) {
        this.numCuenta = numCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldoInicial = saldoInicial;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Persona getTitular() {
        return titular;
    }

    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    
    @Override
    public String toString(){
        return "\n \n Numero de Cuenta:  " + this.getNumCuenta()
                + "\n Tipo de Cuenta: " + this.getTipoCuenta()
                + "\n Saldo Inicial: " + this.getSaldoInicial()
                + "\n Saldo: " + this.getSaldo()
                + "\n Titular de la Cuenta: " + this.getTitular();
        
    }
}
