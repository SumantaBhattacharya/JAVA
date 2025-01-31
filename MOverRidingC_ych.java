public class MOverRidingC_ych{
    public static void main(String[] args) {
        MOverRidingB_ych T1 = new MOverRidingB_ych();
        T1.name = "Suman";
        T1.age = 69;
        T1.Qualification = "Masters in Computer Application";
        T1.display(); // Calls the overridden display method in the child class
        // this is not showing the qualification
    }
}