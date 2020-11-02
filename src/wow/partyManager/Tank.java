package wow.partyManager;

/**
 * The type Tank.
 *
 * @version 2020
 * @author Blake Michalzik
 */
public class Tank extends Role {

    /**
     * Instantiates a new Tank.
     */
    public Tank() {
        super("Tank");
    }

    /**
     * Taunt.
     */
    public void taunt() {
        System.out.println(super.getRoleName() + " is taunting loudly!");
    }
}
