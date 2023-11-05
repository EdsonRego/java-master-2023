public class WrapperInteger {
    public static void main(String[] args) {

        //Converter inteiro primitivo em objeto
        Integer intObjet01 = Integer.valueOf(32767);
        Integer intObjeto2 = 127;
        int intPrimitivo = 32768;
        Integer intObjet03 = Integer.valueOf(intPrimitivo);
        Integer intObjeto4 = intPrimitivo;
        System.out.println("intObjet01 = " + intObjet01);

        //Converter objeto em inteiro primitivo
        int num = intObjet01;
        int num2 = intObjeto2.intValue();
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjet01.shortValue();
        System.out.println("intObjet01 = " + intObjet01);

        Byte byteObjeto = intObjeto2.byteValue();
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjet01.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}
