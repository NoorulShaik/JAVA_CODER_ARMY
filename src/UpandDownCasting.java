public class UpandDownCasting {
    public static void main(String[] args) {
        //Example of Upcasting --No manual casting required
        String s = "Noorul";
        Object o = s;
        //System.out.println(o);

        //Example of DpwnCasting
        Object ob = "Hussain";
        String s1 = (String)ob; //Explicitly add the type
        System.out.println(s1);
//        Object ob1 = 10;
//        String s2 = (String)ob1;
//        System.out.println(s2);
        //Compile Error tho nai aayega lekin run time pe Exception aajayega..!


    }
}
