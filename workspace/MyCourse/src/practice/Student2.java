package practice;

class Constrtr 
{
	Constrtr(String fname,String lname, int rno, int Mscore, int Pscore, int Cscore)
	{
		String Fname = fname;
		String Lname = lname;
		int Rollnumber = rno;
		int Mathscore = Mscore;
		int PhysicsScore = Pscore;
		int ChemistryScore = Cscore;
		int TotalScore = Mscore + Pscore + Cscore;
		System.out.println("Firstname:" + Fname + "\n" + "Lastname:" + Lname + "\n" +"Rollno:" + Rollnumber + "\n" + "Mathscore:" + Mathscore + "\n" + "PhysicsScore :" + PhysicsScore+ "\n" + "ChemistryScore :" +ChemistryScore + "\n" +"Total Score:" + TotalScore);
	}

}
public class Student2
{
	public static void main(String[] args)
	{
		new Constrtr("Avinash","Gunda",123456, 98, 75, 82);
	}
}
