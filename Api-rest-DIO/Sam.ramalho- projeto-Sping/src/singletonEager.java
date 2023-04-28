

/*
singleton apressadinha, instacia o atributo de retorno mais rapido
@autor sam.ramalho


 */
public class singletonEager {
    private  static singletonEager instancia = new singletonEager();

    private singletonEager (){
        super();
    }

    public static singletonEager  getInstancia(){

        return instancia;
    }

}
