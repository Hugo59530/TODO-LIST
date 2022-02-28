package BO.Task;

public class toDoList {
    public int nbrTask = 0;
    public int nbrMaxTask;
    public Task[] Task;


    public toDoList(int nbrMaxTask) {
        this.nbrMaxTask = nbrMaxTask;
        Task = new Task[nbrMaxTask];

    }

    public void add(Task an) {

        if ((nbrTask < nbrMaxTask)) {
            Task[nbrTask] = an;
            nbrTask++;
            System.out.println("Task Added");
        } else
            System.out.println("Erreur");
    }

    public void listTask() {
        int vide = 0;
        for (int i = 0; i < nbrMaxTask; i++) {
            if (Task[i] != null) {
                String result = Task[i].getTask();
                System.out.println("tache :"+i+"\n"+result+"\n--------------");

            }
            if (Task[i]== null){
                vide+=1;
            }
        }
        if (vide == nbrMaxTask){
            System.out.println("Liste vide");
        }
    }

    public void removeTask(int taskNumber){
        boolean result = false;
        nbrTask--;
        if (nbrTask >= 0) {
            Task tempAn = Task[taskNumber];
            System.out.println(tempAn);
            Task[taskNumber] = null;
            result = true;
        }
    }


}
