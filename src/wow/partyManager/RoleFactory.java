package wow.partyManager;

/**
 * The Role factory method.
 *
 * @version 2020
 * @author Blake Michalzik
 */
public class RoleFactory {
    /**
     * Gets role.
     *
     * @param role the role
     * @return the role
     * @throws IllegalArgumentException the illegal argument exception
     */
    public static PartyMember getRole(final String role) throws IllegalArgumentException {
        final char roleFormatted = role.trim().toUpperCase().charAt(0);
        switch (roleFormatted) {
            case 'T' -> {
                return new Tank();
            }
            case 'H' -> {
                return new Healer();
            }
            case 'D' -> {
                return new Dps();
            }
            default -> throw new IllegalArgumentException("That role does not exist.");
        }
    }
}
