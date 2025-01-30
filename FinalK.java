public class FinalK {
    final String uniName="West Bengal University Of Technology";//constant
    int uniFees = 33375;
    String uniCourse;

   static final int uniestablished;// static Blank final variable
   
// constructor
    final int uniStudent;// Blank final variable
   // default constructor
    FinalK() {
       uniStudent = 5000;
    }
 //Static block
 static{
    uniestablished=2001;
 }

    void display_P()
    {
        System.out.println("Maulana Abul Kalam Azad University Of technology formally known as :" + uniName);
        System.out.println("University Fees IS equivalent To:" + uniFees);
        System.out.println( "Bachelors of Computer Application"+uniCourse);
        System.out.println("Total number of Students studying in our University:"+uniStudent);
        System.out.println("The University came into operation formally in "+uniestablished);
    }  
}
