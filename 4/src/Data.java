

public class Data {
    String ano;
    String mes;
    String dia;
    private Data(String data){
        String[] array = data.split("/");
        this.dia = array[0];
        this.mes = array[1];
        this.ano = array[2];
    }
    private Data(String mes, int dia, int ano){
        this.mes = mes;
        this.dia = Integer.toString(dia);
        this.ano = Integer.toString(ano);
    }
    private Data(String dia, String ano){
        this.mes = Math.ceil(Integer.parseInt(dia)/30,417);
        
    }
    
}
