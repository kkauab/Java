
package atores;

/**
 *
 * @author alunolab11
 */
public class Alice {
    float tamanho;
    String corCabelo;
    int posX, posY, posZ = 0;
    
    boolean move(){
        System.out.println("Alice: move()");
        return true;
    }
    void turn(){
        System.out.println("Alice: turn()");
    }
    void say(String text){
        System.out.println("Alice: say()");
        System.out.println(text);
    }
}
