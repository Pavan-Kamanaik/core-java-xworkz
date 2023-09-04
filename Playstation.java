class Playstation{
int id;
String name;
int noOfJoysticks;
int noOfGames;
String typeOfGames;

public Playstation(int id,String name,int noOfJoysticks,int noOfGames,String typeOfGames){
	
	this.id= id;
this.name= name;
this.noOfJoysticks= noOfJoysticks;
this.noOfGames= noOfGames;
this.typeOfGames= typeOfGames;
	
	System.out.println("Playstation ID : "+id);
	System.out.println("Playstation name : "+name);
	System.out.println("Number of Joysticks  : "+noOfJoysticks);
	System.out.println("Number of Games : "+noOfGames);
	System.out.println("Types of Games : "+typeOfGames);
	System.out.println("\n");
}


}