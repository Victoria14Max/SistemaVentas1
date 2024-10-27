package modelo;
public class Prestamo {
  private int nropre;
  private String cliente;
  private double monto;
  private int meses;
  public double interes(){
      return 0.02*meses*monto;
  }  
  public double saldo(){
      return monto+interes();
  }
  public double cuota(){
      return saldo()/meses;
  }

    public int getNropre() {
        return nropre;
    }

    public void setNropre(int nropre) {
        this.nropre = nropre;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public int getMeses() {
        return meses;
    }

    public void setMeses(int meses) {
        this.meses = meses;
    }
  
}
