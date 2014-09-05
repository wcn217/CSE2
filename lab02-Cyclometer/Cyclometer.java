public class Cyclometer{
    public static void main(String[] args){
        //Main method
        int secTrip1 = 480; //Seconds for trip 1
        int secTrip2 = 3220; //2
        int countsTrip1 = 1561; //Numbers of counts for 1
        int countsTrip2 = 9037; //2
        double wheelDiameter = 27.0,
        PI = 3.14159,
        feetPerMile = 5280,
        inchesPerFoot = 12,
        secondsPerMinute = 60;
        double distanceTrip1, distanceTrip2;
        double totalDistance;
        System.out.println("Trip 1 took "+(secTrip1/secondsPerMinute)+" minutes and had "+countsTrip1+" counts.");
        System.out.println("Trip 1 took "+(secTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        distanceTrip1/=inchesPerFoot*feetPerMile;
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;
        System.out.println("Trip 1 was "+distanceTrip1+ " miles.");
        System.out.println("Trip 2 was "+distanceTrip2+ " miles.");
        totalDistance = distanceTrip1+distanceTrip2;
        System.out.println("The total distance was "+totalDistance+" miles.");
        //This code will print the total distance as well as the two seperate distances
        //of a bike trip.
    }
}