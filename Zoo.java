public class Zoo{
  public static void main(String[] args){
    Animal[] zoo= new Animal[4];
    zoo[0]= new Animal("dog", "woof");
    zoo[1]= new Animal("cat", "meow");
    zoo[2]= new Animal("cow", "ummu");
    zoo[3]= new Animal("frog", "ribbit");
    all_sounds(zoo);
      
}
  public static void all_sounds(Animal[] zoo){
    for(int i =0; i<4; i++){
      System.out.println(zoo[i].name+" goes "+ zoo[i].sound);
    }
  }
}