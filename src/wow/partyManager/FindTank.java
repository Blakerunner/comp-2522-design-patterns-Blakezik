package wow.partyManager;

/**
 * The type Find tank.
 */
public class FindTank extends FindRole {

    /**
     * Add role party member.
     *
     * @return the party member
     */
    public static PartyMember addRole() {
        return new Tank();
    }
}
