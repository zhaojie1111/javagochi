/**
 * Created by k1764016 on 30/10/17.
 */
public class Creature {
    int energy,fullness,happiness;
    String name;
    public Creature(String name){
        energy = 15;
        fullness = 15;
        happiness = 15;

        this.name = name;
    }
    public void eat(){
        if(fullness >= 12) {
        print("woops," + this.getName() + "is already full");
        }else{
            fullness += 8;
            happiness -= 6;
            energy -= 4;
            if (fullness > 15) {fullness = 15;}

            print("Yum," + this.getName() + "really enjoyed that!";
        }
    }
    public void sleep(){
        if(energy >= 12) {
            print("woops," + this.getName() + "is already full");
        }else{
            energy += 8;
            happiness -= 6;
            fullness -= 4;
            if (fullness > 15) {fullness = 15;}

    }
    public void play(){
        happiness += 8;
        energy -= 6;
        fullness -= 4;

        print("This was so much fun! Let's do it again!");

    }
    public String checkStatus(){
        String status = "";
        if(happiness <= 6){
            status += "Oh," + this.getName() + "is feeling sad\n";
        }

        if(energy <= 6){
        status += "Humm," + this.getName() + "is really tired\n";

    }
        if(fullness <= 6)
      status += "woops," + this.getName() + "is super hungry\n";
        }
      public String getName(){
        return name;
    }
    public void print(String s){
        System.out.println(s);
    }
}
