package br.com.java.basics;

public class TypeConversionTypeCasting {
    public static void main(String[] args) {
        // Type Conversion (Widening) - conversão automática de um tipo de dados menor para um tipo de dados maior
        int intValue = 100;
        long longValue = intValue; // Conversão automática de int para long
        System.out.println("Type Conversion (Widening): " + longValue);

        // Type Casting (Narrowing) - conversão explícita de um tipo de dados maior para um tipo de dados menor
        double doubleValue = 3.14;
        // o tipo de dado double é maior que o tipo de dado int, então é necessário fazer um cast para converter o valor de double para int de forma explícita
        //int valueFailed = doubleValue;
        int castedIntValue = (int) doubleValue; // Conversão explícita de double para int, mas isso pode resultar em perda de precisão, pois o valor decimal será truncado e apenas a parte inteira será mantida
        System.out.println("Type Casting (Narrowing): " + castedIntValue);

        // a sequencia abaixo mostra os tipos e as conversoes de tipos numéricos em Java, do menor para o maior:

        byte byteValue = 127; // 1 byte, 8 bits
        short shortValue = byteValue; // 2 bytes, 16 bits
        int intValue2 = shortValue; // 4 bytes, 32 bits
        long longValue2 = intValue2; // 8 bytes, 64 bits
        float floatValue = longValue2; // 4 bytes, 32 bits
        double doubleValue2 = floatValue; // 8 bytes, 64 bits

        System.out.println("Type Conversion Sequence: " + doubleValue2);

        // a sequencia abaixo mostra os tipos e as conversoes de tipos numéricos em Java, do maior para o menor:

        double doubleValue3 = 3.14; // 8 bytes, 64 bits
        float floatValue2 = (float) doubleValue3; // 4 bytes,
        long longValue3 = (long) floatValue2; // 8 bytes, 64 bits
        int intValue3 = (int) longValue3; // 4 bytes, 32 bits
        short shortValue2 = (short) intValue3; // 2 bytes, 16 bits
        byte byteValue2 = (byte) shortValue2; // 1 byte, 8 bits

        System.out.println("Type Casting Sequence: " + byteValue2);
    }

}
