//Creating class name ComputeVolumeOfEarth to calculate the volume of earth in cubic kilometer and cubic miles
class ComputeVolumeOfEarth{
public static void main(String args[]){
	// creating variable name radiusOfEarth of type int and assign the earth's radius
  int radiusOfEarth = 6378;
  // Calculating volume of earth in cublic kilometer and storing the value in the variable name volumeOfEarthInCubicKilometer of type double
  double volumeOfEarthInCubicKilometer = (4.0/3) * 3.14 * (radiusOfEarth *radiusOfEarth*radiusOfEarth) ;
  // Calculating volume of earth in cublic miles and storing the value in the variable name volumeOfEarthInCubicMiles of type double
  double volumeOfEarthInCubicMiles = volumeOfEarthInCubicKilometer * 1.6;
 // Display volume of earth in cubic kilometer and volume of earth in cubic miles
  System.out.println("The volume of earth in cubic kilometers is "+ volumeOfEarthInCubicKilometer +"and cubic miles is "+ volumeOfEarthInCubicMiles);
}
}