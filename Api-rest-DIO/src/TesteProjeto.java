/*
import java.util.Arrays;

public class TesteProjeto {
    public static void main(String[] args) {

*/
/* singleton
 *//*

        singletonLAzy lAzy = singletonLAzy.getInstancia();
        System.out.println(lAzy);
        singletonLAzy lazy = singletonLAzy.getInstancia();
        System.out.println(lAzy);

        */
/* Eagger - instacia mais rapida
        *//*


        singletonEager eager = singletonEager.getInstancia();
        System.out.println(eager);
        eager = singletonEager.getInstancia();
        System.out.println(eager);

//        Holder
        singletonHolder holder = singletonHolder.getInstancia();
        System.out.println(holder);
        holder = singletonHolder.getInstancia();
        System.out.println(holder);


    */
/*  Strategy do Robozinho  *//*


    comportamento normal = new comportamentoNormal();
    comportamento defensivo = new comportamentoDefensivo();
    comportamento agressivo = new comportamentoAgressivo();


    Robor robor = new Robor();
    robor.setAcaoRobo(normal);
    robor.mover();
    robor.mover();


    robor.setAcaoRobo(defensivo);
    robor.mover();
    robor.mover();


    robor.setAcaoRobo(agressivo);
    robor.mover();
    robor.mover();

    }

}
*/
