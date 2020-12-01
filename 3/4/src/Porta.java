

public class Porta{

    String cor;
    boolean estaAberta = false;
    float largura;
    float altura;


    public void set_cor(String )

    void abre(){
        estaAberta = true;
    }

    void fecha(){
        estaAberta = false;
    }

    boolean estaAberta(){
        if(estaAberta){
            return true;
        }else{
            return false;
        }
    }
}
