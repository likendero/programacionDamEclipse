
package ejemplos;
import java.util.Scanner;
/**
 *
 * @author likendero
 */
// terminar ejercicioDoce()
public class UltimosEjercicios {
    public static void main(String[] args){
        //ejercicioTres();
        //ejercicioCuatro();
        //ejercicioCinco();
        //ejercicioSeis();
        //ejercicioSiete();
        //ejercicioOcho();
        //ejercicioNueve();
        //ejercicioDiez();
        //ejercicioOnce();
        //ejercicioDoce();
        //ejercicioTrece();
        //ejercicioCatorce();
        //ejercicioQuince();
        //ejercicioDieciseis();
        //ejercicioDiecisiete();
        //ejercicioDieciocho();
    }
public static void ejercicioTres(){
    //variables
    int num1=12;
    int num2=4;
    int suma,multiplicacion,division,resto,resta;
    //operaciones
    suma=num1+num2;
    resta=num1-num2;
    multiplicacion=num1*num2;
    division=num1/num2;
    resto=num1%num2;
    // salida
    System.out.println("suma= "+suma);
    System.out.println("resta= "+resta);
    System.out.println("multiplicacion= "+multiplicacion);
    System.out.println("division= "+division);
    System.out.println("resto= "+resto);
    }
public static void ejercicioCuatro(){
    Scanner key=new Scanner(System.in);
    //calcular bolumen y superficie
    double radio;
    //dar valor al radio
    System.out.println("introduce el valor del radio en cm");
    radio=key.nextInt();
    //salida
    System.out.println("el volumen es "+(4/3*Math.PI*Math.pow(radio, 3))+" cm³");
    System.out.println("la superficie es "+ (4*Math.PI*Math.pow(radio,2))+" cm²");
}
public static void ejercicioCinco(){
    Scanner key=new Scanner(System.in);
    //hacer la media de 3 numeros
    //variables
    int num1,num2,num3;
    //entrada
    System.out.println("introduce el primer numero");
    num1=key.nextInt();
    System.out.println("segundo numero");
    num2=key.nextInt();
    System.out.println("tercer numero");
    num3=key.nextInt();
    //salida
    System.out.println("la media es"+((num1+num2+num3)/3.0));
    System.out.println("fin del programa");
}
public static void ejercicioSeis(){
    Scanner key=new Scanner(System.in);
    // este programa calcula el area de un rectangulo
    //variables
    int base,altura;
    //entrada 
    System.out.println("introduce la base");
    base=key.nextInt();
    System.out.println("introduce la altura");
    altura=key.nextInt();
    //salida
    System.out.println("el area es "+(base*altura));
}
public static void ejercicioSiete(){
    Scanner key=new Scanner(System.in);
    /* 
    este programa calcula la nota final de progrmacion siendo la media de 3 parciales
    55% el examen el 30% y el final el 15% restante
    */
    //variables
    double parcial1,parcial2,parcial3,notaExamen,notaFinal;
    //entrada
    System.out.println("introduce el primer parcial");
    parcial1=key.nextDouble();
    System.out.println("Introduce el segunod parcial");
    parcial2=key.nextDouble();
    System.out.println("introduce el tercer parcial");
    parcial3=key.nextDouble();
    System.out.println("Introduce la nota del examen");
    notaExamen=key.nextDouble();
    System.out.println("Introduce la nota del trabajo final");
    notaFinal=key.nextDouble();
    //salida
    System.out.println("nota= "+(((parcial1+parcial2+parcial3)/3.0)*0.55+notaExamen*0.3+notaFinal*0.15));
    key.close();
}
public static void ejercicioOcho(){
    Scanner key=new Scanner(System.in);
    //porcentaje de hombres y de mujeres en una empresa
    //variables
    int hombres,mujeres;
    //entrada
    System.out.println("numero de mujeres");
    mujeres=key.nextInt();
    System.out.println("numero de hombres");
    hombres=key.nextInt();
    //salida
    System.out.println("el porcentaje de mujeres es de "+(mujeres*100/(hombres+mujeres))+"%");
    System.out.println("el porcentaje de hombres es de "+(hombres*100/(hombres+mujeres))+"%");
}
public static void ejercicioNueve(){
    Scanner key=new Scanner(System.in);
    /*
    calcular el sueldo de un trabajador con sueldo base y un acomision del 10% por venta
    si en un mes hace 3 ventas
    */
    // variables
    double sueldoBase,venta1,venta2,venta3;
    //entrada
    System.out.println("introduce el sueldo base");
    sueldoBase=key.nextDouble();
    System.out.println("introduce valor de la venta uno");
    venta1=key.nextDouble();
    System.out.println("introduce el valor dos");
    venta2=key.nextDouble();
    System.out.println("introduce el valor de la venta tres");
    venta3=key.nextDouble();
    //salida
    System.out.println("el sueldo final es de "+(sueldoBase+(venta1+venta2+venta3)*0.10)+"€");
}
public static void ejercicioDiez(){
    Scanner key=new Scanner(System.in);
    /* 
    cacular el sueldo mensual de un trabajador teniendo en cuenta las horas normales
    + horas extra
    */
    //variables
    double sueldoBase,valorHoraExtra;
    int horasExtra;
    //entrada
    System.out.println("el numero de horas de trabajo es de 8 horas");
    System.out.println("introduce el sueldo base");
    sueldoBase=key.nextDouble();
    System.out.println("introduce el valor de la hora extra");
    valorHoraExtra=key.nextDouble();
    System.out.println("introduce el numero de horas extra");
    horasExtra=key.nextInt();
    //salida
    System.out.println("sueldo final= "+(sueldoBase+horasExtra*valorHoraExtra));
}
public static void ejercicioOnce(){
    Scanner key=new Scanner(System.in);
    //pasar de grados C a Farenheit
    // variables
    double centigrados;
    //entrada
    System.out.println("introduce la temperatura en grados centigrados");
    centigrados=key.nextDouble();
    //salida
    System.out.println(centigrados+" grados centigrados en farenheit son = "+(32+(9*centigrados/5)));
}
public static void ejercicioDoce(){
    Scanner key=new Scanner(System.in);
    /* 
    algoritmo pida un numero y:
    calcular su quinta parte
    resto de dividir por cinco
    la tercera parte de la quinta parte
    */
    //variables
    int numero;
    //entrada
    System.out.println("intoduce el numero");
    numero=key.nextInt();
    //salida
    System.out.println("la quinta parte es "+ numero/5);
    System.out.println("el resto de dividir entre 5 es "+ numero%5);
    System.out.println("el resultado de hacer la tercera parte de la quinta parte es "
            + ((numero/5)/3));
}
public static void ejercicioTrece(){
    Scanner key=new Scanner(System.in);
    /*
    pasar de km/h m/s
    */
    // variables
    double velocidad;
    //entrada
    System.out.println("introduce la velocidad en km/h");
    velocidad = key.nextDouble();
    //salida
    System.out.println("la velocidad en m/s es de " + velocidad/3.6);
}
public static void ejercicioCatorce(){
    Scanner key=new Scanner(System.in);
    //calcula la hipotenusa de un triangulo rectangulo
    //variables
    double catetoUno,catetoDos;
    //entrada
    System.out.println("Introduce el primer cateto");
    catetoUno = key.nextDouble();
    System.out.println("Introduce el segundo cateto");
    catetoDos = key.nextDouble();
    //salida
    System.out.println("la hipotenusa es "
            + (Math.sqrt(Math.pow(catetoUno,2)+Math.pow(catetoDos,2))));
}
public static void ejercicioQuince(){
    Scanner key = new Scanner(System.in);
    // par o impar
    //variables
    int num;
    //entrada
    System.out.println("introduce un numero");
    num = key.nextInt();
    //salida
    System.out.println(num%2==0?"es par":"no es par");
}
public static void ejercicioDieciseis(){
    Scanner key = new Scanner(System.in);
    // numero multiplo de 10
    //variables
    int num;
    //entrada
    System.out.println("Introduce un numero");
    num = key.nextInt();
    //salida
    System.out.println(num%10==0?"es multiplo":"no es multiplo");
}
public static void ejercicioDiecisiete(){
    Scanner key = new Scanner(System.in);
    //mostrar el mayor de dos numeros
    //variables
    int num1,num2;
    //entrada
    System.out.println("introduce el primer numero");
    num1 = key.nextInt();
    System.out.println("el segundo numero");
    num2 = key.nextInt();
    //salida
    System.out.println(num1>num2?"el primero es mayor al segundo":"el segundo es mayor al primero");
}
public static void ejercicioDieciocho(){
    Scanner key = new Scanner(System.in);
    //introducir no ta y decir su estado, a o s
    //variables
    float nota;
    //entrada
    System.out.println("Introduce la nota");
    nota = key.nextFloat();
    //salida
    System.out.println(nota>-1 && nota<11?(5.0f<=nota?"aprobado":"suspenso"):"erronea");
}

}
