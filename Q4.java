public class Q4 {
public static void main(String[] args) {

  int height = 10;
  int width = 10; 

  for (int y = height; y >= -10; y--){
   for (int x = -10 ; x <= width; x++){
     DrawAxis(x,y);
     System.out.print(DrawAxis (x,y));

   }
   System.out.print("\n");
  }

}




 public static String DrawAxis(int x, int y)
 {
   if (x == 10 && y == 0)
      return ">";
   else 
     if (x == 0 && y == 10)
      return "          ^";
   else 
     if (x == 0 && y == 0)
       return ".";
   else 
      if (x == 0 && y >= -10)
        return "          |";
   else
     if ( x >= -10 && y == 0)
      return "-";

return "";}
 }