interface IVechicle
{
  void drive();
  void turnLeft();
  void brake(); 
} 
interface IPublicTransport 
{
  void getNumberOfPeople();
} 
class MotorisedVechicle 
{
  void checkMotor() 
  {
    System.out.println("The motor of the vechicle is in good comndition");
  } 
}
class car extends MotorisedVechicle implements IVechicle 
{
  public void drive()
  {
    System.out.println("The car is in drive mode");
  } 
  public void turnLeft()
  { 
    System.out.println("The car is in turnLeft mode");
  }
  public void brake()
  {
    System.out.println("The car is in brake mode");
  }
}
class Train implements IVechicle,IPublicTransport
{ 
  public void drive()
  {
    System.out.println("The train is in drive mode"); 
  } 
  public void turnLeft()
  {
    System.out.println("The train is in turnLeft mode");
  }
  public void brake()
  { 
    System.out.println("The train is in brake mode");
  }
  public void getNumberOfPeople() 
  {
    System.out.println("train has some 200 people"); 
   }
} 
class test{ public static void main(String[] args)
{ 
  IVechicle c=new car();
  c.drive;
  c.turnLeft;
  c.brake;
  IVechicle t=new train();
  t.drive;
  t.turnLeft; 
  t.brake; 
  IPublicTransport t=new train();
  t.getNumberOfPeople;
}
          }
