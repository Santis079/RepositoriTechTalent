package UD7;

import java.util.HashMap;

import javax.swing.JOptionPane;

public class ProvaClase {

    public static void main(String[] args) {
        HashMap<String, Integer> edadesAlumnos = new HashMap<>();

        edadesAlumnos.put("Juan", 25);
        edadesAlumnos.put("Pedro", 28);
        edadesAlumnos.put("María", 30);

        System.out.println("HashMap inicial:");
        mostrarEdadesAlumnos(edadesAlumnos);

        agregarAlumnoDesdeInput(edadesAlumnos);
        agregarAlumnoDesdeInput(edadesAlumnos);
        agregarAlumnoDesdeInput(edadesAlumnos);
        agregarAlumnoDesdeInput(edadesAlumnos);
        

        System.out.println("\nHashMap después de agregar alumnos desde input:");
        mostrarEdadesAlumnos(edadesAlumnos);
    }

    private static void agregarAlumnoDesdeInput(HashMap<String, Integer> edadesAlumnos) {
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del nuevo alumno:");

        int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de " + nombre + ":"));

        edadesAlumnos.put(nombre, edad);
    }

    private static void mostrarEdadesAlumnos(HashMap<String, Integer> edadesAlumnos) {

        for (String nombre : edadesAlumnos.keySet()) {
            int edad = edadesAlumnos.get(nombre);
            System.out.println(nombre + " => " + edad);
        }
    }
}


//import java.util.HashMap;
//import java.util.Hashtable;
//
//public class ProvaClase {
//    public static void main(String[] args) {
//        // Crear un HashMap con clave de tipo String y valor de tipo Integer
//        HashMap<String, Integer> edadesAlumnos = new HashMap<>();
//
//
//        // Agregar elementos al HashMap
//        edadesAlumnos.put("Juan", 25);
//        edadesAlumnos.put("Pedro", 28);
//        edadesAlumnos.put("María", 30);
//        
//        //edadesAlumnos {
//        // 		"María"=> 30,
//        //		"Pedro"=> 28,
//        //		"Juan"=> 25
//        //}
//
//        // Obtener el valor asociado a una clave
//        int edadDeJuan = edadesAlumnos.get("Juan"); //25
//        int edadDeMaria = edadesAlumnos.get("María"); //30
//        int edadDePedro = edadesAlumnos.get("Pedro"); //28
//        System.out.println("Edad de Juan: " + edadDeJuan);
//        System.out.println("Edad de María: " + edadDeMaria);
//        System.out.println("Edad de Pedro: " + edadDePedro);
//
//        // Iterar sobre las claves del HashMap
//        System.out.println("Claves en el edadesAlumnos:");
//        for (String nombre : edadesAlumnos.keySet()) {
//            System.out.println(nombre);
//        }
//
//        // Iterar sobre los valores del HashMap
//        System.out.println("Valores en el edadesAlumnos:");
//        for (int edad : edadesAlumnos.values()) {
//            System.out.println(edad);
//        }
//
//        // Comprobar si una clave está en el HashMap
//        boolean contienePedro = edadesAlumnos.containsKey("Pedro");
//        System.out.println("¿El edadesAlumnos contiene a Pedro? " + contienePedro);
//
//        int tamaño = edadesAlumnos.size();
//        System.out.println("Tamaño del edadesAlumnos: " + tamaño);
//        // Eliminar un elemento del HashMap
//        edadesAlumnos.remove("María");
//
//        // Obtener el tamaño del HashMap
//        tamaño = edadesAlumnos.size();
//        System.out.println("Tamaño del edadesAlumnos: " + tamaño);
//        
//        
//        //Actualizar valor "SETEAR" 
//
//        edadesAlumnos.put("Pedro", 29);
//        edadDePedro = edadesAlumnos.get("Pedro"); //Ahora 29
//        System.out.println("Edad de Pedro: " + edadDePedro);
//        
//        
//    }
//}