import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Spotify[] spotify = new Spotify[4];

        for (int i = 0; i < spotify.length; i++) {

            int spotifyId = sc.nextInt(); sc.nextLine();
            String profileName = sc.nextLine();
            String subscriptionType = sc.nextLine();
            double price = sc.nextDouble(); sc.nextLine();
            String groupSessionsAvailable = sc.nextLine();

            spotify[i] = new Spotify(spotifyId, profileName, subscriptionType, price, groupSessionsAvailable);
        }

        String subTypeCheck = sc.nextLine();
        String groupSessionCheck = sc.nextLine();

        // Method call
        double avg = searchSpotifyPriceAvg(spotify, subTypeCheck, groupSessionCheck);
        if (avg > 0) {
            System.out.println(avg);
        } else {
            System.out.println("No such users");
        }
        sc.close();
    }

    public static double searchSpotifyPriceAvg(Spotify[] spotify, String subTypeCheck, String groupSessionCheck) {
        double avg = 0.0;
        int count = 0;
        for (int i = 0; i < spotify.length; i++) {
            if (spotify[i].getSubscriptionType().equalsIgnoreCase(subTypeCheck) &&
                    spotify[i].getGroupSessionsAvailable().equalsIgnoreCase(groupSessionCheck)) {

                avg += spotify[i].getPrice();
                count++;
            }
        }
        if (count > 0)
            return (avg / count);
        else
            return count;
    }
}


class Spotify {
    private int spotifyId;
    private String profileName;
    private String subscriptionType;
    private double price;
    private String groupSessionsAvailable;

    public Spotify(int spotifyId, String profileName, String subscriptionType, double price,
            String groupSessionsAvailable) {
        this.spotifyId = spotifyId;
        this.profileName = profileName;
        this.subscriptionType = subscriptionType;
        this.price = price;
        this.groupSessionsAvailable = groupSessionsAvailable;
    }

    public int getSpotifyId() {
        return spotifyId;
    }

    public void setSpotifyId(int spotifyId) {
        this.spotifyId = spotifyId;
    }

    public String getProfileName() {
        return profileName;
    }

    public void setProfileName(String profileName) {
        this.profileName = profileName;
    }

    public String getSubscriptionType() {
        return subscriptionType;
    }

    public void setSubscriptionType(String subscriptionType) {
        this.subscriptionType = subscriptionType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getGroupSessionsAvailable() {
        return groupSessionsAvailable;
    }

    public void setGroupSessionsAvailable(String groupSessionsAvailable) {
        this.groupSessionsAvailable = groupSessionsAvailable;
    }
}
