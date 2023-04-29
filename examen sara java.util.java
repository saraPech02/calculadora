import java.util.Scanner;

public class Principal{

    Scanner scanner=new Scanner(System.in);

    public static void main (String [] arga){
        public class calculadora {
            float primerNumero;
            Float segundoNmuero;
        
            public calculadora(){
                this.primerNumero;
                this.segundoNmuero;
                
            }
        int opcion =0;
       
        do {
        
        System.out.println("Bienvenido a la libreria de narinia");
        System.out.println("selecciona una opcion");
        System.out.println("A.suma");
        System.out.println("B.resta");
        System.out.println("C.multiplicacion");
        System.out.println("D.divicion");
        System.out.println("E.expocitor");
    

        System.out.println("escoge tu operacion");
        int opcion=scanner.nextInt();

        switch(opcion){
            case 1:
            System.out.println("A");
            public void sumar (){
                System.out.println("favor de poner los numeros");
                float sum = primerNumero + segundoNmuero;
                System.out.println( "la suma es:" + sum);
            }
            break;

            case 2;
            public void restar(){
                System.out.println("B");
                System.out.println("favor de colocar los numeros");
                float rest = primerNumero - segundoNmuero;
                System.out.println("la resta es:" - rest);
            }
    

            break;

            case 3;
            public void multiplicacion(){
                system.out.println("C");
                Float mult = primerNumero * segundoNmuero;
                system.out.println("la multiplicacion es:" * mult);
            }

             case 4;
            public void division(){
                System.out.println("D");
                float div = primerNumero / segundoNmuero;
                 System.out.println("la division es:" / div);
            
            }
            break;

            case 5;
            public double exponencial(double x, double y) {
                return Math.pow(x, y);
                system.out,println(" el exponencial e:"double x, double y);
            }

            default;
            sysrem.println("j-Z");
            System.out.println("Error datos no correspondientes");
            break;

        }


    } while (opcion != 9);
   
    input.close;
}

}
}