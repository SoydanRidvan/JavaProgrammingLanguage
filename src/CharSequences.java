public class CharSequences {

    public static void main(String[] args) {


        String a = "Java";
        String b = "Java";
        String c = "Java"; // All of this 3 objects will be in String Pool, but just one object will be created
                            // One object can be referenced by multiple variables

        System.out.println(a == b); // True => a and b are referencing same object


        String str1 = new String("Java");
        String str2 = new String("Java");
        String str3 = new String("Java");

        System.out.println(str1 == str2); // False

        System.out.println(a.equals(str1)); // True
        // If you compare the values of two object, equals method can be used

        String s = "Java";

        s.concat(" School");

        System.out.println(s); // "Java" => Cannot be changed

        System.out.println("=============================================");


        StringBuilder stringBuilder = new StringBuilder("Java");

        stringBuilder.append(" School");

        System.out.println(stringBuilder); // "Java School"

        System.out.println("=============================================");


        StringBuffer stringBuffer = new StringBuffer("Java");

        stringBuffer.append(" School");
        stringBuffer.append(" has started");

        System.out.println("stringBuffer = " + stringBuffer);


    }
}
