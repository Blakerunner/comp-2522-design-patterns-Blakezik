package wow.partyManager;

/**
 * The type Dps.
 *
 * @version 2020
 * @author Blake Michalzik
 */
public class Dps extends Role {

    /**
     * Instantiates a new Dps.
     */
    public Dps() {
        super("Dps");
    }

    /**
     * Big Damage.
     */
    public void bigDamage() {
        System.out.println(super.getRoleName() + " is doing BIG deeps!");
    }
}
