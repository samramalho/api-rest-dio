

/*
singleton apressadinha, instacia o atributo de retorno mais rapido, encapusula
@autor sam.ramalho


 */
public class singletonHolder {
    private  static class InstanceHolder {

        public static singletonHolder instancia = new singletonHolder();
    }

    private singletonHolder(){
        super();
    }

    public static singletonHolder getInstancia(){

        return InstanceHolder.instancia;
    }

}
