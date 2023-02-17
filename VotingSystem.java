import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
import java.util.HashMap;
public class VotingSystem {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, String> nominees = new HashMap<Integer, String>(); //for nominees
        HashMap<Integer, String> voters = new HashMap<Integer, String>(); //for voters
        boolean flag = true;
        while (flag) {
            System.out.println("1.Enter the nominee details(both id and name):");
            System.out.println("2.Enter the voters details(both id and name):");
            System.out.println("3.Enter the nominee for whom the voter voted");
            System.out.println("4.Here comes the winner");
            System.out.println("5. Exit");

            int n = s.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Enter the number of nominees");
                    int numberofnom = s.nextInt();
                    for (int i = 0; i <= numberofnom; i++) {
                        System.out.println("Enter the nominee id");
                        int nomid = s.nextInt();
                        System.out.println("Enter the nominee name");
                        String nomname = s.next();
                        nominees.put(nomid, nomname);
                    }
                    break;
                case 2:
                    System.out.println("Enter the number of voters");
                    int numberofvot = s.nextInt();
                    for (int j = 0; j <= numberofvot; j++){
                        System.out.println("Enter the voter id:");
                        int voterid = s.nextInt();
                        System.out.println("Enter the voter name");
                        String votername = s.next();
                        voters.put(voterid, votername);
                    }
                    System.out.println(voters);
                    break;
                case 3:
                    HashMap<Integer, String> voter
                            = new HashMap<Integer, String>();{
                    System.out.println("Enter the name and id of the nominee you wanted to vote");
                    String nomname = s.next();
                    int nomid = s.nextInt();
                    String key = nomname + "(" + nomid + ")";
                    if (nominees.containsKey(key)) {
                        nominees.put(key, nominees.get(key));
                        System.out.println("Voter " + " voted for " + nomname + "and (" + nomid + ")");
                    } else {
                        System.out.println("Not entered properly");
                    }

                }
                break;
                case 4:
                    String winner = null;
                    int maximumvotes = 0;
                    for (Map.Entry<Integer, String> entry : nominees.entrySet()) {
                        if (entry.getKey() > maximumvotes) {
                            maximumvotes = entry.getKey();
                            winner = entry.getKey();
                            System.out.println("(+winner+) has got " + maximumvotes + " which is maximum");
                        }
                    }
                    break;

                case 5:
                    flag = false;
                    break;

            }
        }
    }
}
