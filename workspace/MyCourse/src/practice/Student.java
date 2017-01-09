package practice;

class Details
{
  int rno;
  int Mscore, Pscore, Cscore, TotalScore;
  String Name;
  void entername(String Name)
  {
	  String Myname = Name;
	  System.out.println("Name:" + Myname);
  }
  void enterDet(int rno)
  {
    int Rollnumber = rno;
    System.out.println("rollnumber:" + Rollnumber);
  }
  void computeTotal(int Mscore, int Pscore, int Cscore)
  {
    TotalScore = Mscore + Pscore+ Cscore;
    System.out.println("Mathscore:" + Mscore);
    System.out.println("PhysicsScore :" + Pscore);
    System.out.println("ChemistryScore :" +Cscore);
    System.out.println("Total Score:" + TotalScore);
  }
}
class Student
{
  public static void main(String args[]) 
  {
    Details d = new Details();
    d.entername("avi");
    d.enterDet(364679);
    d.computeTotal(95, 78 , 80);
  }
}
