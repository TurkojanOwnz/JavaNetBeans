
package aula02;


public class Caneta {
    private string modelo;
    private string cor;
    private float ponta;
    private int carga;
    private boolean tampada;
    
    public void SetModelo(string modelo)
    {
        //PODEM SER FEITAS AS VALIDAÇÔES NO METÓDO SETTER
        this.modelo = modelo;
    }
    
    public string GetModelo()
    {
        return(this.modelo);
    }
    
    public void SetCor(string cor)
    {
        this.cor = cor;
    }
    
    public string GetCor()
    {
        return(this.cor);
    }
    
    public void SetPonta(float ponta)
    {
        this.ponta = ponta;
    }
    
    public float GetPonta()
    {
        return(this.ponta);
    }
    
    public void SetCarga(int carga)
    {
        this.carga = carga;
    }
    
    public int GetCarga()
    {
        return(this.carga);
    }
    
    public void SetEstadoTampa(boolean Estado)
    {
        this.tampada = Estado;
    }
    
    public boolean GetEstadoTampa()
    {
        return(this.tampada);   
    }
    
    void Rabiscar(){
        if (this.tampada == true) {
            System.out.println("Erro ao tentar rabiscar! Caneta tampada.");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }
    
    void Tampar(){
        SetEstadoTampa(true);
    }
    
    void Destampar(){
        SetEstadoTampa(false);
    }
    
    void Status(){
        System.out.println("Modelo: " + GetModelo());
        System.out.println("Uma caneta: " + GetCor());
        System.out.println("Ponta: " + Float.toString(GetPonta()));
        System.out.println("Carga: " + Integer.toString(GetCarga()));
        System.out.println("Esta tampada? " + Boolean.toString(GetEstadoTampa()));
    }
}
