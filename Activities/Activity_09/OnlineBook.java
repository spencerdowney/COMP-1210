/**
*
*/
public class OnlineBook extends OnlineTextItem {

   protected String author;
   
   /**
   * @param nameIn the nameIn.
   * @param priceIn the priceIn.
   */
   public OnlineBook(String nameIn, double priceIn) {
   
      super(nameIn, priceIn);
      author = "Author Not Listed";
   }   
   
   /**
   * @return the information.
   */
   public String toString() {
   
      return name + " - " + author + ": $" + super.calculateCost();
   }
   
   /**
   * @param authorIn the authorIn.
   * @return author the author.
   */
   public String setAuthor(String authorIn) {
   
      author = authorIn;
      return author;
   }
}