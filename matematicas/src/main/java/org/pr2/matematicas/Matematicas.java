package matematicas;



public class Matematicas{
    
    
    
    public static int sumaNumeros(int n){if (n < 0) throw new ArithmeticException("La sumahasta el n-ésimo número natural no es aplicable aun n menor que 0");
    
    
    return n == 0?0:n + sumaNumeros(n - 1);

}


}