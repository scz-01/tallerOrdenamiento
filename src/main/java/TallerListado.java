import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TallerListado {

    int opcionMenu = 0;
    // String auxiliar;
    String nuevoNombre;

    List<String> listaNombres = new ArrayList<>(Arrays.asList("Ana", "Luis", "María", "José", "Elena",
            "Carlos", "Sofía", "Javier", "Lucía", "Diego",
            "Isabel", "Fernando", "Patricia", "Manuel", "Clara",
            "David", "Marta", "Raúl", "Sara", "Andrés",
            "Laura", "Miguel", "Carmen", "Pedro", "Julia"));

    public void menu(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Taller Final");
        do {

            System.out.println("--- MENU ---");
            System.out.println("1 - Mostrar Nombres");
            System.out.println("2 - Agregar Nombre");
            System.out.println("3 - Mostrar Nombres Ordenados(Burbuja)");
            System.out.println("4 - Mostrar Nombres Ordenados(Insertion)");
            System.out.println("5 - Salir");
            System.out.print("Seleccione una opcion: ");
            opcionMenu = teclado.nextInt();

            switch (opcionMenu){
                case 1:
                    MostrarListado();
                    break;

                case 2:
                    AgregarNombre();
                    break;

                case 3:
                    // System.out.println("Nombres ordenados");
                    ListaOrdenada();
                    break;
                case 4:
                    OrdenadaInsertion(listaNombres);
                    break;

                case 5:
                    System.out.println("Cerrando programa ...");
                    opcionMenu=5;
                    break;
            }

        }while (opcionMenu != 5);

        teclado.close();
    }

    public void AgregarNombre(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa un nombre: ");
        nuevoNombre = teclado.next();
        // Convertimos la primera letra en mayuscula para que ordene correctamente
        String nombreMayus = nuevoNombre.toUpperCase().charAt(0) + nuevoNombre.substring(1,nuevoNombre.length()).toLowerCase();
        listaNombres.add(nombreMayus);
    }

    public void MostrarListado(){
        for (int i = 0; i < listaNombres.size(); i++) {
            System.out.println(listaNombres.get(i));
        }
    }


    public void ListaOrdenada(){

        // Algoritmo de burbuja

        for (int i = 0; i < listaNombres.size() - 1; i++) {
            for (int j = 0; j < listaNombres.size() - 1 - i; j++) {
                if (listaNombres.get(j).compareTo(listaNombres.get(j + 1)) > 0) {
                    // Intercambiar los elementos
                    String temp = listaNombres.get(j);
                    listaNombres.set(j, listaNombres.get(j + 1));
                    listaNombres.set(j + 1, temp);
                }
            }
        }

        // Arreglo ordenado
        System.out.println("Arreglo ordenado");
        for(int i = 0 ; i<listaNombres.size(); i++){
            System.out.println(listaNombres.get(i));
        }
    }


    // Metodo para ordenar con insertionSort
    public void OrdenadaInsertion(List<String> listaNombres){
        for (int i = 0; i < listaNombres.size(); i++) {
            String clave = listaNombres.get(i);
            int j = i -1;

            //Desplazamos los elementos que son mayores
            while (j >= 0 && listaNombres.get(j).compareTo(clave)>0){
                listaNombres.set(j + 1, listaNombres.get(j)); //Desplazamos el dato a la derecha
                j--;
            }

            listaNombres.set(j+1,clave);
        }
        System.out.println(listaNombres);
    }

}
