public class Zoo{
  public static void main(String[] args){
    Animal[] zoo= new Animal[5];
    zoo[0]= new Animal("dog", "woof");
    zoo[1]= new Animal("cat", "meow");
    zoo[2]= new Animal("cow", "ummu");
    zoo[3]= new Animal("frog", "ribbit");
    zoo[4]= new Animal("chiken", "kkokkio kokoko");
   
    all_sounds(zoo);
      
}
  public static void all_sounds(Animal[] zoo){
    for(int i =0; i<5; i++){
      System.out.println(zoo[i].name+" goes "+ zoo[i].sound);
    }
  }
}