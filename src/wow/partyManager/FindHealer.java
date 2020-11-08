package wow.partyManager;

/**
 * The type Find healer.
 */
public class FindHealer extends FindRole {

    /**
     * Add role party member.
     *
     * @return the party member
     */
    public static PartyMember addRole() {
        return new Healer();
    }
}
