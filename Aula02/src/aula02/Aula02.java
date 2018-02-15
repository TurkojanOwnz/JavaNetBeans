
package aula02;


public class Aula02 {

   
    public static void main(String[] args) {
       Caneta c1 = new Caneta();
        
        c1.cor = "azul";
        c1.ponta = 1f;
        c1.tampar();
        //c1.rabiscar();
        //c1.destampar();
        c1.rabiscar();
        c1.status();
        
        Caneta c2 = new Caneta();
        c2.modelo = "Rostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.rabiscar();
        c2.status();
    }
    
}
