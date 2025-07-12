package IPA_mock1;

import java.util.Scanner;

class Photographer {
    private int id;
    private String name, specialization;
    private double rating;

    public Photographer(int a, String b, String c, double rating) {
        this.id = a;
        this.name = b;
        this.specialization = c;
        this.rating = rating;
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getSpec() {
        return this.specialization;
    }

    public double getRating() {
        return this.rating;
    }

    @Override
    public String toString() {
        return "id-" + getId() + "\n" +
                "name-" + getName() + "\n" +
                "specialization-" + getSpec() + "\n" +
                "rating-" + getRating();
    }
}

public class Solution {
    public static int countPhotographersBySpecialization(Photographer[] arr, String spec) {
        int c = 0;
        for (Photographer item : arr) {
            if (item.getSpec().equalsIgnoreCase(spec)) {
                c++;
            }
        }
        return c;
    }

    public static Photographer getSecondHighestRatedPhotographer(Photographer[] arr) {
        Photographer highest = null;
        Photographer secondHighest = null;

        for (Photographer item : arr) {
            if (highest == null || item.getRating() > highest.getRating()) {
                secondHighest = highest;
                highest = item;
            } else if ((secondHighest == null || item.getRating() > secondHighest.getRating())
                    && item.getRating() < highest.getRating()) {
                secondHighest = item;
            }
        }

        return secondHighest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Photographer[] arr = new Photographer[n];

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            double d = sc.nextDouble();

            arr[i] = new Photographer(a, b, c, d);
        }

        sc.nextLine();
        String spec = sc.nextLine();
        int c = countPhotographersBySpecialization(arr, spec);
        Photographer ans = getSecondHighestRatedPhotographer(arr);

        System.out.println("\n--Output--\n");

        if (c > 0)
            System.out.println("Number of photographers in " + spec + ": " + c);
        else
            System.out.println("No photographers found in given specialization.");

        if (ans != null)
            System.out.println(ans);
        else
            System.out.println("Second highest rated Photographer not available");

        sc.close();
    }
}
