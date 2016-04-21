

public class Allergies {
  public static String alan(String score){
    int scoreTotal = Integer.parseInt(score);
    String allergenNames = "";
    //list of allergens
    String[] allergens={"cats","pollen","chocolate","tomatoes","strawberry","shellfish","penus","eggs"};
    //list of scores
    Integer[] allerScores = {128,64,32,16,8,4,2,1};

    for (int i=0; i < allergens.length ; i++){
      if (allerScores[i] <= scoreTotal){
        //subtract score[i] from score total
        scoreTotal -= allerScores[i];
        //add to allgennames allergens[i]
        allergenNames += " "+ allergens[i];
      }
    }
    System.out.println(allergenNames);
    return allergenNames.trim();
  }
}
