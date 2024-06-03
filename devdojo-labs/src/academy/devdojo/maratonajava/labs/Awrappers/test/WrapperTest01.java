package academy.devdojo.maratonajava.labs.Awrappers.test;

public class WrapperTest01 {
    public static void main(String[] args) {
        byte bytep = 1;
        short shortp = 1;
        int intp = 1;
        long longp = 1L;
        float floatp = 1.0F;
        double doublep = 2.0D;
        char charp = 'a';
        boolean booleanp = true;

        Byte byteW = 1;
        Short shortW = 1;
        Integer intW = 1;
        Long longW = 1L; // autoboxing
        Float floatW = 2.0F;
        Double doubleW = 3.0D;
        Character charW = 'a';
        Boolean booleanW = true;

        int i = intW; // unboxing
        Boolean verdadeiro = Boolean.parseBoolean("true");
        System.out.println(verdadeiro);
        verdadeiro = Boolean.valueOf("false");
        System.out.println(verdadeiro);
        verdadeiro = Boolean.logicalAnd(booleanW, booleanp);
        System.out.println(verdadeiro);
        verdadeiro = Boolean.TRUE;
        System.out.println(verdadeiro);

        System.out.println(Character.isDigit('B'));
        System.out.println(Character.isDigit('2'));
        System.out.println(Character.isDigit('a'));

        

    }
}
