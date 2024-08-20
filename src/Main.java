import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Brayan Yair Mendez Rodriguez
        Scanner teclado = new Scanner(System.in);
        int total, veinte=0, cincuenta=0, cien=0, doscientos=0, quinientos=0;git status
        int seleccion =0;
        while (seleccion<=4){
            System.out.println();
            System.out.println("\t\tBIENVENIDO A SU ALCANCIA VIRTUAL");
            System.out.println("¿QUE DESEA HACER?\n 1. Agregar moneda \n 2. Contar sus monedas de cada valor \n 3. Calcular el total del dinero ahorrado \n 4. Romper la alcancia");
            seleccion = teclado.nextInt();

            switch (seleccion){
                case 1 : System.out.println("Escoja el valor de la moneda que desea ingresar: ");
                    System.out.println(" 1. 20$ \n 2. 50$ \n 3. 100$ \n 4. 200$ \n 5. 500$");

                    int moneda= teclado.nextInt();
                    if (moneda>5 || moneda<=0) {
                        System.out.println("No se agrego ninguna moneda, seleccione una opción valida");
                    }
                    switch (moneda){
                        case 1 : veinte=veinte+1;
                        break;
                        case 2 : cincuenta=cincuenta+1;
                        break;
                        case 3 : cien=cien+1;
                        break;
                        case 4 : doscientos=doscientos+1;
                        break;
                        case 5 : quinientos=quinientos+1;
                        break;
                    }
                    break;
                case 2 :
                    System.out.println("SU TOTAL DE MONEDAS ES: \n Monedas de 20$= " +veinte+ "\n Monedas de 50$= "+cincuenta+ "\n Monedas de 100$= " +cien);
                    System.out.println(" Monedas de 200$= " +doscientos+ "\n Monedas de 500$= " +quinientos);
                    break;
                case 3 :total= ((veinte*20)+(cincuenta*50)+(cien*100)+(doscientos*200)+(quinientos*500));
                    System.out.println("TOTAL DE DINERO AHORRADO: " + total);
                    break;
                case 4 : System.out.println("Su alcancía ha sido vaciada");
                veinte =0;
                cincuenta=0;
                cien=0;
                doscientos=0;
                quinientos=0;
                    int salir = 0;
                    while (salir>2 || salir <=0){
                        System.out.println("¿Desea volver al menu inicial? \n 1. SI \n 2. NO");
                        salir = teclado.nextInt();
                        if (salir>2 || salir<=0) {
                            System.out.println("Seleccione una opción valida");
                        }
                        switch (salir){
                            case 1 : seleccion=0;
                                break;
                            case 2 : seleccion=6;
                                break;
                        }
                    }
                    break;
                }
            }
        }
    }
