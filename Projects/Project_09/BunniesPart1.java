/** **/
public class BunniesPart1 {
   /**
   * @param args the args.
   */
   public static void main(String[] args) {
   
      PetBunny pb = new PetBunny("Floppy", "Holland Lop", 3.5);
      HouseBunny hb = new HouseBunny("Spot", "Really Mixed", 5.8, 0.15);
      JumpingBunny jb = new JumpingBunny("Speedy", "English", 6.3, 25.0);
      ShowBunny sb = new ShowBunny("Bigun", "Flemish Giant", 14.6, 22.0);
      
      System.out.println(pb);
      System.out.println();
      System.out.println(hb);
      System.out.println();
      System.out.println(jb);
      System.out.println();
      System.out.println(sb);
   }
}