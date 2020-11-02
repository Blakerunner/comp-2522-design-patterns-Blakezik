package wow.partyManager;

/**
 * The type Role.
 *
 * @author Blake Michalzik
 * @version 2020
 */
public abstract class Role implements PartyMember {
    private final String roleName;

    /**
     * Instantiates a new Role.
     *
     * @param roleName the role name
     */
    public Role(String roleName) {
        this.roleName = roleName;
    }

    /**
     * Gets role name.
     *
     * @return the role name
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Summon the party member.
     */
    public void summon() {
        System.out.println("Summoning " + roleName);
    }
}
