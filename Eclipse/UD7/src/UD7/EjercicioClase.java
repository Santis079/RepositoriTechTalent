package UD7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class EjercicioClase {

    public static void main(String[] args) {
        Map<String, Integer> estudiantesTechTalent = new HashMap<>();

        estudiantesTechTalent.put("Laia", 23);
        estudiantesTechTalent.put("Aurora", 30);
        estudiantesTechTalent.put("Alexandre", 28);
        estudiantesTechTalent.put("Jose", 26);
        estudiantesTechTalent.put("Santos", 24);
        estudiantesTechTalent.put("Manel", 26);
        estudiantesTechTalent.put("Alejandro", 19);
        estudiantesTechTalent.put("Isabel", 18);
        estudiantesTechTalent.put("Toni", 23);
        estudiantesTechTalent.put("Diego", 22);
        estudiantesTechTalent.put("Sebas", 29);
        estudiantesTechTalent.put("Abdel", 20);
        estudiantesTechTalent.put("Joel", 22);
        estudiantesTechTalent.put("Jessica", 26);
        estudiantesTechTalent.put("Ana Maria", 29);

        System.out.println("Información de alumnos:");
        mostrarEstudiantes(estudiantesTechTalent);

        System.out.println("\nGrupos de 3 personas con keys random:");
        mostrarGruposAleatorios(estudiantesTechTalent, 5, 3);

        System.out.println("\nGrupos por orden alfabético:");
        mostrarGruposAlfabeticos(estudiantesTechTalent, 3);

        System.out.println("\nGrupos por edades de menor a mayor:");
        mostrarGruposPorEdades(estudiantesTechTalent, 3);
    }

    private static void mostrarEstudiantes(Map<String, Integer> estudiantes) {
        for (Map.Entry<String, Integer> entry : estudiantes.entrySet()) {
            System.out.println("Nombre " + entry.getKey() + ", Edad: " + entry.getValue());
        }
    }

    private static void mostrarGruposAleatorios(Map<String, Integer> estudiantes, int numGrupos, int personasPorGrupo) {
      List<String> keys = new ArrayList<>(estudiantes.keySet());
      Random random = new Random();

      for (int i = 0; i < numGrupos * personasPorGrupo; i += personasPorGrupo) {
          System.out.println("Grupo " + (i / personasPorGrupo + 1) + ":");
          for (int j = 0; j < personasPorGrupo; j++) {
              String nombre = keys.get(random.nextInt(keys.size()));
              System.out.println("Nombre " + nombre + ", Edad: " + estudiantes.get(nombre));
            }
        }
    }

    private static void mostrarGruposAlfabeticos(Map<String, Integer> estudiantes, int personasPorGrupo) {
        List<String> keys = new ArrayList<>(estudiantes.keySet());
        Collections.sort(keys);

        for (int i = 0; i < keys.size(); i += personasPorGrupo) {
            System.out.println("Grupo " + (i / personasPorGrupo + 1) + ":");
            for (int j = 0; j < personasPorGrupo && i + j < keys.size(); j++) {
                String nombre = keys.get(i + j);
                System.out.println("Nombre " + nombre + ", Edad: " + estudiantes.get(nombre));
            }
        }
    }

    private static void mostrarGruposPorEdades(Map<String, Integer> estudiantes, int personasPorGrupo) {
        List<Map.Entry<String, Integer>> list = new ArrayList<>(estudiantes.entrySet());
        list.sort(Comparator.comparing(Map.Entry::getValue));

        for (int i = 0; i < list.size(); i += personasPorGrupo) {
            System.out.println("Grupo " + (i / personasPorGrupo + 1) + ":");
            for (int j = 0; j < personasPorGrupo && i + j < list.size(); j++) {
                Map.Entry<String, Integer> entry = list.get(i + j);
                System.out.println("Nombre " + entry.getKey() + ", Edad: " + entry.getValue());
            }
        }
    }
}


