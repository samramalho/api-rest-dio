

 /*
instacia em processo quando
 @autor sam.ramalho


  */
public class singletonLAzy {
    private  static singletonLAzy instancia;

    private singletonLAzy (){
        super();
    }

    public static singletonLAzy getInstancia(){
        if (instancia == null){
            instancia = new singletonLAzy();

        }
        return instancia;
    }

}
