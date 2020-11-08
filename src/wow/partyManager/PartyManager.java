package wow.partyManager;

import java.util.ArrayList;

/**
 * The class Party manager.
 *
 * @author Blake Michalzik
 * @version 2020
 */
public class PartyManager {
    /**
     * The Party.
     */
    final ArrayList<PartyMember> party = new ArrayList<>();

    /**
     * Build party.
     */
    public void buildParty() {
        party.add(FindTank.addRole());
        party.add(FindRole.addRole());
        party.add(FindHealer.addRole());
        party.add(FindDps.addRole());
        party.add(FindDps.addRole());
    }

    /**
     * Print party.
     */
    public void printParty() {
        System.out.println("Your party consists of:");
        for (PartyMember member : party) {
            System.out.println(member.getClass());
        }
    }

    /**
     * Summon party.
     */
    public void summonParty() {
        for (PartyMember member : party) {
            member.summon();
        }
    }

    /**
     * Action party.
     */
    public void actionParty() {
        for (PartyMember member : party) {
            if (member instanceof Tank) {
                ((Tank) member).taunt();
            }
            if (member instanceof Healer) {
                ((Healer) member).heal();
            }
            if (member instanceof Dps) {
                ((Dps) member).bigDamage();
            }
        }
    }

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        PartyManager partyManager = new PartyManager();

        partyManager.buildParty();
        System.out.println();

        partyManager.printParty();
        System.out.println();

        partyManager.summonParty();
        System.out.println();

        partyManager.actionParty();
    }
}
