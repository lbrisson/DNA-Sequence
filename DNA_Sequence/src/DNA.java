public class DNA {
  
  public static void main(String[] args) {
  //DNA Program
    String dna1 = "CGCAATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGAGAGA";
    String dna3 = "ATTAATATGCTGA";
    String dna = dna1;
    System.out.println(dna.length());
    
    int start = dna.indexOf("ATG");
    int end = dna.indexOf("TGA");
    
    System.out.println("Start: " +start);
    System.out.println("End: " +end);
    
if (start != -1 && end != -1 && (end - start) % 3 == 0) {

  System.out.println("Condition 1 and 2 and 3 are satisfied.");
  
  String protein = dna.substring(start, end+3);
  System.out.println("Protein: " + protein);

} else {
  System.out.print("No protein");
}
  }
}