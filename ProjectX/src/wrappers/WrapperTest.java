package wrappers;

public class WrapperTest {
    public static void main(String[] args) {


        // 2.1
        Integer i1 = 5;
        Integer i2 = Integer.valueOf(5);
        Integer i3 = new Integer(5);
        Integer i4 = Integer.parseInt("5");
        // 3.1, 3.2
        Double i5 = 5.3;
        byte b = i5.byteValue();
        System.out.println(b);
        short sh = i5.shortValue();
        System.out.println(sh);
        int i = i5.intValue();
        System.out.println(i);
        float f = i5.floatValue();
        System.out.println(f);
        long l = i5.longValue();
        System.out.println(l);
        //4
//        System.out.println(Double.NaN);
//        System.out.println(Double.POSITIVE_INFINITY);
//        System.out.println(Double.NEGATIVE_INFINITY);
        // 4.1
        Double d = 1.0;
        Double d1 = 0.0;
        // 4.2
        Double nanValue = d / d1;
        // 4.3
        Double infinityValue = d1 / d1;
        // 4.4
        System.out.println(nanValue);
        System.out.println(infinityValue);

        // 4.5
        if (nanValue.isNaN()) {
            System.out.println("Переменная " + nanValue + " = NaN");
        } else if (nanValue.isInfinite()) {
            System.out.println("Переменная " + nanValue + " = Infinity");
        } else {
            System.out.println("Переменная " + nanValue + " = обычное число");
        }

        if (infinityValue.isNaN()) {
            System.out.println("Переменная " + infinityValue + " = NaN");
        } else if (infinityValue.isInfinite()) {
            System.out.println("Переменная " + infinityValue + " = Infinity");
        } else {
            System.out.println("Переменная " + infinityValue + " = обычное число");
        }
        // 5
        Long l1 = 120l;
        Long l2 = 120l;
        // 5.1
        System.out.println(l1 == l2);
        // 5.2
        l1 = 1200l;
        l2 = 1200l;
        System.out.println(l1 == l2);
    }
}
