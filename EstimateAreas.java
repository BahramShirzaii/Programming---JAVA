import java.lang.Math;

public class EstimateAreas {
    public static void main(String[] args) {

        double R = 6371.01;

        double[][] cities = {
                {33.748995, -84.387982}, // Atlanta
                {28.538336, -81.379234}, // Orlando
                {32.080898, -81.091203}, // Savannah
                {35.227085, -80.843124}  // Charlotte
        };


        for (int i = 0; i < cities.length; i++) {
            cities[i][0] = Math.toRadians(cities[i][0]); // latitude
            cities[i][1] = Math.toRadians(cities[i][1]); // longitude
        }

        double d1 = greatCircleDistance(R, cities[0], cities[1]); // Atlanta–Orlando
        double d2 = greatCircleDistance(R, cities[1], cities[2]); // Orlando–Savannah
        double d3 = greatCircleDistance(R, cities[0], cities[2]); // Atlanta–Savannah
        double d4 = greatCircleDistance(R, cities[2], cities[3]); // Savannah–Charlotte
        double d5 = greatCircleDistance(R, cities[3], cities[0]); // Charlotte–Atlanta

        double area1 = heronArea(d1, d2, d3); // مثلث Atlanta-Orlando-Savannah
        double area2 = heronArea(d3, d4, d5); // مثلث Atlanta-Savannah-Charlotte

        double totalArea = area1 + area2;

        System.out.printf("Estimated area enclosed by the four cities: %.2f km²\n", totalArea);
    }

    public static double greatCircleDistance(double R, double[] city1, double[] city2) {
        double lat1 = city1[0];
        double lon1 = city1[1];
        double lat2 = city2[0];
        double lon2 = city2[1];

        return R * Math.acos(Math.sin(lat1) * Math.sin(lat2) +
                Math.cos(lat1) * Math.cos(lat2) *
                        Math.cos(lon1 - lon2));
    }

    public static double heronArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}
