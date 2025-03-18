package atores;

import java.util.Random;

/**
 *
 * @author alunolab11
 */
public class UsaAlice {
    
    public static void main(String[] args) {
        Alice a01 = new Alice();
        
        a01.corCabelo = "Roxo";
        a01.posX = 0;
        a01.posZ = 0;
        
        a01.move();
        a01.turn();
        
        
        Random rd = new Random();
        if(rd.nextInt(10) > 6){
            a01.say("BUUUUUU");
        } else {
            a01.say("OIIIIIIIIIIIIIIII");
        }

    }

}
