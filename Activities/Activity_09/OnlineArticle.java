/**
*
*/
public class OnlineArticle extends OnlineTextItem {

   private int wordCount;
   
   /**
   * @param nameIn the nameIn.
   * @param priceIn the priceIn.
   */
   public OnlineArticle(String nameIn, double priceIn) {
   
      super(nameIn, priceIn);
      wordCount = 0;
   }
   
   /**
   * @param wordCountIn the wordCountIn.
   * @return wordCount the wordCount.
   */
   public int setWordCount(int wordCountIn) {
   
      wordCount = wordCountIn;
      return wordCount;
   }
}