class Sam{
      public static void main(String[] args){
      float maths_mark = 94f;
      System.out.println("Sam's mark in Maths is " + maths_mark + " out of 100");
      float physics_mark = 95f;
      System.out.println("Sam's mark in Physics is " + physics_mark + " out of 100");
      float chemistrys_mark = 96f;
      System.out.println("Sam's mark in Chemistrys is " + chemistrys_mark + " out of 100");
      float total_marks = physics_mark + chemistrys_mark + maths_mark;
      System.out.println("Total marks obtain by Sam is " + total_marks);
      float average_marks = (total_marks/3);
      System.out.println("Sam's average mark in PCM is " + average_marks);
      }
}