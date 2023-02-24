
class Ques1 {
    public static void main(String[] args)
    {
        int N = 5, total_marks = 0;
        float percentage;
  
        // create 1-D array to store marks
        int marks[] = { 89, 75, 82, 60, 95 };
  
        // calculate total marks
        for (int i = 0; i < N; i++) {
            total_marks += marks[i];
        }
        System.out.println("Total Marks : " + total_marks);
  
        // calculate percentage
        percentage = (total_marks / (float)N);
        System.out.println(
            "Total Percentage : " + percentage + "%");
    }
}