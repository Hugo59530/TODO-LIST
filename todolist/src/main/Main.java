package main;
import BO.Task.Task;
import BO.Task.toDoList;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        toDoList toDoList = new toDoList(10);
        int result = 0;

        while (result != 4) {
            int exit = 0;
            // Ce menu servira à naviguer dans la todolist
            System.out.print("\t\tTo Do List\n");

            System.out.print("-> Voir la to do list : 1\n");
            System.out.print("-> Ajouter une tache : 2\n");
            System.out.print("-> Suprimer une tache : 3\n");
            System.out.print("-> Quitter : 4\n");

            System.out.print("\n-> Choisissez une entrée du menu : ");
            result = scanner.nextInt();


            while (exit == 0 ) {
                if (result != 1 && result != 2 && result != 3 && result != 4) {
                    System.out.print("-> Merci de rentrer uniquement les chiffres proposer dans le menu\n");
                    exit =1;
                }

                if (result == 1) {
                    toDoList.listTask();
                    exit = 1;
                }

                if (result == 2) {
                    System.out.print("\t\t Creation d'une tache /!\\ merci de mettre des points à la place des espaces /!\\ \n");
                    System.out.print("Merci d'instcrire le nom de la tache  : ");
                    String name = scanner.next ();

                    System.out.print("Merci d'instcrire le statu de la tache (Non commence = 0| en cours = 1 | Termine = 3) : ");
                    int statut = scanner.nextInt();


                    System.out.print("\n");
                    System.out.print("Merci d'instcrire le contenu  de la tache  : ");
                    String content = scanner.next();


                    System.out.print("\n");
                    Task task = new Task(name, statut, content);
                    toDoList.add(task);
                    exit = 1;
                }

                if (result == 3 ){
                    System.out.print("Merci d'instcrire le numero  de la tache  : ");
                    int taskNumber = scanner.nextInt();
                    toDoList.removeTask(taskNumber);
                    exit = 1;
                }

            }

        }

    }


    }

