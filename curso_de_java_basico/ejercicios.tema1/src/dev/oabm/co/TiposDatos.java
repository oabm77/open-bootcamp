package dev.oabm.co;

public class TiposDatos {
    public static void main(String[] args) {
        // 1. Numéricos
        // 1.1. Enteros
        byte variable1 = 5;
        short variable2 = 10;
        int variable3 = 30;
        long variable4 = 456000000L;
        // 1.2 Decimales
        float variable5 = 5.5f;
        double variable6 = 165465.5e10d;

        // 2. Booleano
        boolean variable7 = true;
        boolean variable8 = false;

        // 3. Texto
        char variable9 = 'x';
        String variable10 = "Hola cómo estás?";

        // Imprime tipos de variable y sus valores
        System.out.println("variable1 => [ tipo: " + ((Object) variable1).getClass().getName() + ", valor: " + variable1 + " ]");
        System.out.println("variable2 => [ tipo: " + ((Object) variable2).getClass().getName() + ", valor: " + variable2 + " ]");
        System.out.println("variable3 => [ tipo: " + ((Object) variable3).getClass().getName() + ", valor: " + variable3 + " ]");
        System.out.println("variable4 => [ tipo: " + ((Object) variable4).getClass().getName() + ", valor: " + variable4 + " ]");
        System.out.println("variable5 => [ tipo: " + ((Object) variable5).getClass().getName() + ", valor: " + variable5 + " ]");
        System.out.println("variable6 => [ tipo: " + ((Object) variable6).getClass().getName() + ", valor: " + variable6 + " ]");
        System.out.println("variable7 => [ tipo: " + ((Object) variable7).getClass().getName() + ", valor: " + variable7 + " ]");
        System.out.println("variable8 => [ tipo: " + ((Object) variable8).getClass().getName() + ", valor: " + variable8 + " ]");
        System.out.println("variable9 => [ tipo: " + ((Object) variable9).getClass().getName() + ", valor: " + variable9 + " ]");
        System.out.println("variable10 => [ tipo: " + ((Object) variable10).getClass().getName() + ", valor: " + variable10 + " ]");
    }
}
