
package boletin6;

/**
 *
 * @author atejidosolla
 */
public class Conta {
    
     private String nome, numCuenta;
     private double saldo,retirado, ingresado;
        
     public Conta(){
         
     }
         
        
     public Conta(String nome,String numCuenta,double saldo,double retirado,double ingresado){
        
        this.nome = nome;
        this.numCuenta = numCuenta;
        this.saldo = saldo;
        this.ingresado = ingresado;
        this.retirado = retirado;
        
    }

    public void setIngresado(double ingresado) {
       
        this.ingresado = ingresado;
        
        if (ingresado>=0){
            System.out.println(true);
        }   
        else
        
        System.out.println(false);
        saldo = saldo+ingresado;
                
    }

    public void retirado(double retirado){
        
        this.retirado = retirado;
        
        if (retirado>0)
            System.out.println(true);
        
        else
            System.out.println(false);
        
          saldo = saldo - retirado;
   
                
                }
    
    public void visualizar(){
        
        System.out.println("Los datos del cliente son "+ " nombe " + nome+" con Numero de cuenta "+  numCuenta +
                " y el Saldo Actual es de "+saldo+" euros ");
    }
    public void setSaldo(double saldo) {
        
        this.saldo = saldo;
        
     }
            
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }
    
     public void Transferencia(String CuentaDestino,String CuentaOrigen,double importe){
      
      if (saldo >=importe)
          System.out.println(" Se transfiere " + importe + " € desde el número de cuenta "+ CuentaOrigen + " el número de cuenta "+ CuentaDestino );
      
      else
          System.out.println(" El saldo es insuficiente ");
     }
}
