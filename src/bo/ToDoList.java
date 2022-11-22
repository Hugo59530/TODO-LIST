package bo;

public class ToDoList {
    public int nbrTask = 0;
    public int nbrMaxTask;
    public Task[] task;

    public ToDoList(int nbrMaxTask) {
        this.nbrMaxTask = nbrMaxTask;
        task = new Task[nbrMaxTask];
    }

    public void add(Task an) {

        if ((nbrTask < nbrMaxTask)) {
            task[nbrTask] = an;
            nbrTask++;
            System.out.println("Task Added");
        } else {
            System.out.println("Erreur");
        }    
    }

    public void listTask() {
        int vide = 0;
        for (int i = 0; i < nbrMaxTask; i++) {
            if (task[i] != null) {
                String result = task[i].getTask();
                System.out.println("Tache :"+i+"\n"+result+"\n--------------");
            }
            if (task[i]== null){
                vide+=1;
            }
        }
        if (vide == nbrMaxTask) {
            System.out.println("Liste vide");
        }
    }

    public void removeTask(int TaskNumber){
        boolean result = false;
        nbrTask--;
        if (nbrTask >= 0) {
            Task tempAn = task[TaskNumber];
            System.out.println(tempAn);
            task[TaskNumber] = null;
            result = true;
        }
    }
}
