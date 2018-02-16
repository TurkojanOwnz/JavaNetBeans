
package aula02;


public class Aula02 {

   
    public static void main(String[] args) {
       Caneta minhaCaneta = new Caneta();
        
        minhaCaneta.SetCor("azul");
        minhaCaneta.SetPonta(1f);
        minhaCaneta.Tampar();
        //c1.rabiscar();
        //c1.destampar();
        minhaCaneta.Rabiscar();
        minhaCaneta.Status();
        
        Caneta minhaOutraCaneta = new Caneta();
        minhaOutraCaneta.SetModelo("Rostnet");
        minhaOutraCaneta.SetCor("Preta");
        minhaOutraCaneta.Destampar();
        minhaOutraCaneta.Rabiscar();
        minhaOutraCaneta.Status();
    }
    
}
