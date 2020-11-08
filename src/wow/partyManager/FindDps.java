package wow.partyManager;

/**
 * The type Find dps.
 */
public class FindDps extends FindRole {

    /**
     * Add role party member.
     *
     * @return the party member
     */
    public static PartyMember addRole() {
        return new Dps();
    }
}
