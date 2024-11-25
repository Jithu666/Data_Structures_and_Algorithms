import java.util.ArrayList;
import java.util.Scanner;

public class to_DO {

    private static ArrayList<String> tasks = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    public static void main(String[] args) {
        while(true) {
            showMenu();
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1: addTask();
                break;
                case 2: removeTask();
                break;
                case 3: viewTasks();
                break;
                case 4: System.exit(0);
                default:
                    System.out.println("Enter a choice between 1 and 3");
            }
        }
    }

    public static void showMenu( ) {
        System.out.println("To Do Application ");
        System.out.println("1. Add Tasks");
        System.out.println("2. Remove Tasks");
        System.out.println("3. View Tasks");
        System.out.println("4. Exit \n");
        System.out.println("Enter Your Choice : ");
    }

    public static void addTask() {
        System.out.println("Enter the Task : ");
        String task = sc.nextLine();
        tasks.add(task);
        System.out.println("Task added");
    }

    public static void removeTask() {

        if(tasks.isEmpty()) {
            System.out.println("No tasks to remove.");
            return;
        }

        viewTasks();
        System.out.println("Enter the task number to remove : ");
        int taskNumber = Integer.parseInt(sc.nextLine());

        if(taskNumber > 0 && taskNumber <= tasks.size()){
            tasks.remove(taskNumber - 1);
            System.out.println("Task Removed");
        } else {
            System.out.println("Enter valid task number");
        }
    }

    public static void viewTasks() {

        if(tasks.isEmpty()) {
            System.out.println("No tasks in the List.");
            return;
        }

        System.out.println(" \n To Do List");
        for(String task : tasks){
            System.out.println(task);
        }
    }
}
