public class CustomMethods {


    public static void main(String[] args) {

        String str = "Golden Ball";
        String result = reverse(str);
        System.out.println("result = " + result);

        String str2 = "Time";
        System.out.println(reverse(str2));

    }


    public static String reverse (String str){
        return new StringBuilder(str).reverse().toString();
    }




}
