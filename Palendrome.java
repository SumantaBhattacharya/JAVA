public class Palendrome {
    public static void main(String[] args) {
        String s= "madam";
        String reverse="";//empty string
        for (int i=s.length()-1;i>=0;i--){
            reverse=reverse+s.charAt(i);
            

        }

        if(s.equals(reverse)){
            System.out.println("The given "+s +" is"+" palendrome");
        }else{
        System.out.println("not a palendrome");}
        
    }
}
