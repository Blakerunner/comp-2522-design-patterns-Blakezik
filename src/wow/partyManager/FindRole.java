package wow.partyManager;

/**
 * The type Find role.
 */
public class FindRole {

    /**
     * Add role party member.
     *
     * @return the party member
     */
    public static PartyMember addRole() {
        return new Dps();
    }
}
