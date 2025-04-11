package polymorphism;

class  Calculation{

    public static int addition(int num1, int num2){
        return num1+num2;
    }
    //number of params are diff
    public static int addition(int num1, int num2 , int num3){
        return num1+num2+num3;
    }

    // data type is diff
    public static float addition(float num1, float num2){
        return num1+num2;
    }
    //number of params are diff
    public static float addition(float num1, float num2 , float num3){
        return num1+num2+num3;
    }

    // data type sequesne is diff
    public static float addition(int num1, float num2){
        return num1+num2;
    }
    public static float addition(float num1, int num2){
        return num1+num2;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculation calc = new Calculation();
        System.out.println(calc.addition(10, 20)   );
        System.out.println(calc.addition(10, 20,30)   );
        System.out.println(calc.addition(10F, 20F)   );
        System.out.println(calc.addition(10F, 20F,30F)   );
        System.out.println(calc.addition(10 , 20F))   ;
        System.out.println(calc.addition(10F, 20 ) ) ; 
    }
}
