public class Studentc {
    int roll_no;
    String cell_no;
public static void main(String args[]){
    Studentc std1 = new Studentc();
    Studentc std2 = new Studentc();
    std1.roll_no= 1;
    std1.cell_no="7674010567";
    std2.cell_no="6304890917";
    std2.roll_no=2;
   System.out.println("Student roll no : "+std1.roll_no);
   System.out.println("Student cell no : "+std1.cell_no);
   System.out.println("Student roll no : "+std2.roll_no);
   System.out.println("Student cell no : "+std2.cell_no);
}
}
