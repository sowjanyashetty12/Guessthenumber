// guess the number game
import java.util.*;
class Game {
public int a ;
public int yourguess;
public int Numberofguesses=1;
// getters nd settersof numberofguess
public void setNumberofguesses(int Numberofguesses)
{
this.Numberofguesses=Numberofguesses;
}
public int getNumberofguesses(){
return Numberofguesses;
}
 Game(){
    Random rand = new Random();
    a = rand.nextInt(100);

}
public int UserInput(){
    System.out.println("Enter your number");
      Scanner sc = new Scanner(System.in);
     yourguess=sc.nextInt();
     return yourguess;
    }
   public Boolean iscorrect(){
    Numberofguesses++;
     if(a==yourguess)
      {
        System.out.println("you guessed it right in "+Numberofguesses+"number of guesses");
        return true;
      }
      else if(yourguess>a){
        System.out.println("your guess is greater than the random number");
        return false;
      }
     else{
        System.out.println("your guess is smaller than the random number");
     return false;
     }
   } 
}
    public class GuessTheNumber{
    public static void main(String args[]){
  
    Game obj = new Game();
   boolean b= false;
    while(!b){
      int n = obj.UserInput();
    b = obj.iscorrect();
    }


    }
}