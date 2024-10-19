import java.util.Scanner;

public class ordenarString {

    public ordenarString() {
        String[] arregloNombres = {"Ana", "Luis", "María", "José", "Elena",
                "Carlos", "Sofía", "Javier", "Lucía", "Diego",
                "Isabel", "Fernando", "Patricia", "Manuel", "Clara",
                "David", "Marta", "Raúl", "Sara", "Andrés",
                "Laura", "Miguel", "Carmen", "Pedro", "Julia"};

        // Arreglo sin ordenar
        System.out.println("Arreglo original");
        for(int i = 0 ; i<arregloNombres.length; i++){
            System.out.println(arregloNombres[i]);
        }

        System.out.println(" ");
        // Ordenamiento por metodo burbuja
        String auxiliar;

        for (int i = 0; i < arregloNombres.length-1; i++) {
            for (int j = 0; j < arregloNombres.length-1; j++) {
                if (arregloNombres[j].compareTo(arregloNombres[j+1]) > 0){
                    auxiliar = arregloNombres[j];
                    arregloNombres[j] = arregloNombres[j+1];
                    arregloNombres[j+1] = auxiliar;
                }
            }
        }

        // Arreglo ordenado
        System.out.println("Arreglo ordenado");
        for(int i = 0 ; i<arregloNombres.length; i++){
            System.out.println(arregloNombres[i]);
        }
    }

}
