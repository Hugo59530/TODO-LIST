package go;

import bo.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ToDoList toDoList = new ToDoList(10);
        int result = 0;

        while (result != 4) {
            int exit = 0;
            // Ce menu servira à naviguer dans la Todolist
            System.out.print("\nTo Do List\n\n");

            System.out.print("-> Voir la To do list : 1\n");
            System.out.print("-> Ajouter une tache : 2\n");
            System.out.print("-> Suprimer une tache : 3\n");
            System.out.print("-> Quitter : 4\n");

            System.out.print("\n-> Choisissez une entrée du menu : ");
            result = scanner.nextInt();


            while (exit == 0) {
                if (result != 1 && result != 2 && result != 3 && result != 4) {
                    System.out.print("-> Merci de rentrer les chiffres uniquement proposés dans le menu\n");
                    exit =1;
                }

                if (result == 1) {
                    toDoList.listTask();
                    exit = 1;
                }

                if (result == 2) {
                    System.out.print("\t\t Création d'une tache /!\\ merci de mettre des points à la place des espaces /!\\ \n");
                    System.out.print("Merci d'inscrire le nom de la tache : ");
                    String name = scanner.next ();

                    System.out.print("Merci d'inscrire le statut de la tache (Non commencée = 0| En cours = 1 | Terminée = 3) : ");
                    int statut = scanner.nextInt();


                    System.out.print("\n");
                    System.out.print("Merci d'inscrire le contenu de la tache : ");
                    String content = scanner.next();


                    System.out.print("\n");
                    Task task = new Task(name, statut, content);
                    toDoList.add(task);
                    exit = 1;
                }

                if (result == 3) {
                    System.out.print("Merci d'inscrire le numero de la tache : ");
                    int taskNumber = scanner.nextInt();
                    toDoList.removeTask(taskNumber);
                    exit = 1;
                }
            }
        }
    }
}

