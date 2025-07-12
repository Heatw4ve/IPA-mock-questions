package IPA_mock2;

import java.util.*;

class Journalist {
    private int id, experience;
    private String name, region;

    public Journalist(int a, String b, int c, String d) {
        id = a;
        name = b;
        experience = c;
        region = d;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public int getExp() {
        return this.experience;
    }

    public String getRegion() {
        return this.region;
    }

    @Override
    public String toString() {
        return "id-" + getId() + "\n"
                + "name-" + getName() + "\n"
                + "experience-" + getExp() + "\n"
                + "region-" + getRegion();
    }
}

public class Solution {
    public static double findAverageExperienceByRegion(Journalist[] arr, String region) {
        int total = 0;
        int len = 0;
        for (Journalist item : arr) {
            if (item.getRegion().equalsIgnoreCase(region)) {
                total += item.getExp();
                len++;
            }
        }
        return total / len;
    }

    public static Journalist searchJournalistById(Journalist[] arr, int id) {
        Journalist ans = null;
        for (Journalist item : arr) {
            if (item.getId() == id) {
                ans = item;
                break;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Journalist[] arr = new Journalist[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            String b = sc.next();
            int c = sc.nextInt();
            String d = sc.next();

            arr[i] = new Journalist(a, b, c, d);
        }

        String region = sc.next();
        int id = sc.nextInt();

        System.out.println("\nOutput\n");
        double c = findAverageExperienceByRegion(arr, region);
        Journalist ans = searchJournalistById(arr, id);

        if (c > 0)
            System.out.println("Average experience: " + c);
        else
            System.out.println("No Journalists found from the given region.");

        if (ans != null)
            System.out.println(ans);
        else
            System.out.println("No Journalists found with the given id.");

        sc.close();
    }
}
