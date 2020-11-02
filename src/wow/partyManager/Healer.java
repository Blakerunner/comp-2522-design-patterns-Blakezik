package wow.partyManager;

/**
 * The type Healer.
 *
 * @version 2020
 * @author Blake Michalzik
 */
public class Healer extends Role {

    /**
     * Instantiates a new Healer.
     */
    public Healer() {
        super("Healer");
    }

    /**
     * Heal.
     */
    public void heal() {
        System.out.println(super.getRoleName() + " is healing!");
    }
}
