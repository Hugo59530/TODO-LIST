package BO.Task;

public class Task {
        public String name;
        public int statut;
        public String description;

        public Task(String name, int statut, String description) {

            this.name = name;
            this.statut = statut;
            this.description = description;

        }


        public String getTask(){
            System.out.println("Nom :"+name+ "\n" +
                    " Description de la tache : "+description+"\n " +
                    "Statut de la tache : "+statut);
            return "";
        }


    }

