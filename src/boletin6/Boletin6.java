package boletin6;

/**
 *
 * @author atejidosolla
 */
public class Boletin6 {

       
            
    public static void main(String[] args) {
        
        Conta cont1 = new Conta();       
        cont1.setNome("Juan");
        cont1.setNumCuenta("123456789");
        cont1.setSaldo(65000);
        cont1.retirado(0);
        cont1.setIngresado(2500);
        cont1.visualizar();
        
        Conta cont2 = new Conta();        
        cont2.setNome("Antonio");
        cont2.setNumCuenta("987654321");
        cont2.setSaldo(75000);
        cont2.retirado(1800);
        cont2.setIngresado(0);
        cont2.visualizar();
        cont2.Transferencia("9876543241", "123456789", 1350);
        
        
    }
    
}
