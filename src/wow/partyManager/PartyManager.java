package wow.partyManager;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * The class Party manager.
 *
 * @version 2020
 * @author Blake Michalzik
 */
public class PartyManager {
    /**
     * Main.
     *
     * @param args the args
     */
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final ArrayList<PartyMember> party = new ArrayList<>();
        final int partySize = 5;

        getMembers(partySize, party, scan);
        System.out.println();

        printMembers(party);
        System.out.println();

        summonMembers(party);
        System.out.println();

        actionMembers(party);
    }

    private static void getMembers(final int partySize,
                                   final ArrayList<PartyMember> party,
                                   final Scanner scan) {
        System.out.println("Input a role to join your party.");
        for (int i = 1; i < partySize + 1; i++) {
            System.out.print(i + ": ");
            party.add(RoleFactory.getRole(scan.nextLine()));
        }
    }

    private static void printMembers(final ArrayList<PartyMember> party) {
        System.out.println("Your party consists of:");
        for (PartyMember member : party) {
            System.out.println(member.getClass());
        }
    }

    private static void summonMembers(final ArrayList<PartyMember> party) {
        for (PartyMember member : party) {
            member.summon();
        }
    }

    private static void actionMembers(final ArrayList<PartyMember> party) {
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
}
