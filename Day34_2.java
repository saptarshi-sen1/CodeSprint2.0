import java.util.*;

public class Day34_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String houseLine = sc.nextLine().trim();
        String heaterLine = sc.nextLine().trim();

        houseLine = houseLine.substring(houseLine.indexOf('[') + 1, houseLine.indexOf(']'));
        heaterLine = heaterLine.substring(heaterLine.indexOf('[') + 1, heaterLine.indexOf(']'));

        String[] houseParts = houseLine.split(",");
        String[] heaterParts = heaterLine.split(",");

        int[] houses = new int[houseParts.length];
        int[] heaters = new int[heaterParts.length];

        for (int i = 0; i < houseParts.length; i++) {
            houses[i] = Integer.parseInt(houseParts[i].trim());
        }

        for (int i = 0; i < heaterParts.length; i++) {
            heaters[i] = Integer.parseInt(heaterParts[i].trim());
        }

        Arrays.sort(houses);
        Arrays.sort(heaters);

        int radius = 0;
        for (int house : houses) {
            int left = 0, right = heaters.length - 1;
            int closest = Integer.MAX_VALUE;

            while (left <= right) {
                int mid = (left + right) / 2;
                int dist = Math.abs(heaters[mid] - house);
                closest = Math.min(closest, dist);

                if (heaters[mid] < house) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }

            radius = Math.max(radius, closest);
        }

        System.out.println(radius);
    }
}