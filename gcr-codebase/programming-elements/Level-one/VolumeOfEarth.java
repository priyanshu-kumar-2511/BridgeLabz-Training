class VolumeOfEarth {
    public static void main(String[] args) {
        
        // calculating the volume in km
        double radiusKm = 6378.0;
        double pi = 3.14;
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // calculating the volume in miles after converting radius into miles
        double kmToMiles = radiusKm * 1.6;
        double volumeMiles = volumeKm * Math.pow(kmToMiles, 3);

        // display the result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm + " and cubic miles is " + volumeMiles);
    }
}
