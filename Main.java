import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    //Class to Create expense details (Blueprint & Layout)
    static class Expense {

        //Attributes to Store expense details
        private final int id;
        private final String category;
        private final double amount;
        private final String date;
        private final String description;

        //Constructor to initialize expense Object
        public Expense(int id, String category, double amount, String date, String description) {
            this.id = id;
            this.category = category;
            this.amount = amount;
            this.date = date;
            this.description = description;
        }
        // Overriding to return a string representation of the object
        @Override
        public String toString() {
            return "Expense [id=" + id + ", category=" + category + ", amount=" + amount + ", date=" + date + ", description=" + description + "]";
        }

    }// ------------------------------ End of Class (Blueprint) -------------------------------------------------------------------------------------------------

    // Main Expense tracker App

    private static final ArrayList<Expense> expenses = new ArrayList<>();// Generic ArrayList that can store objects of type Expense.
    private static int expenseId = 1; //Auto incremented ID for expense

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) { // infinite loop till user exits
            //Display Menu Options
            System.out.println("\n Expense Tracker Menu:");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expense");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt(); //Get User Input
            sc.nextLine();

            switch (choice) {
                case 1:
                    addExpense(sc); //call method to add Expense
                    break;
                case 2:
                    viewExpenses();// call method to view expense
                    break;
                case 3:
                    System.out.println("Exiting Application. Goodbye!!!");
                    sc.close();//close scanner before exiting
                    return;// Exit Program
                default:
                    System.out.println("Invalid choice. Please Try Again");
            }

        }
    }
    //---------------------------------- End Of Main Method ------------------------------------------------------------------

    // Method to add an Expense (Create Operation)
    private static void addExpense(Scanner sc){
        System.out.print("Enter category (e.g., Food, Transportation, Bills): ");
        String category = sc.nextLine(); //Read category Input

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter date (e.g., 2020-01-02): ");
        String date = sc.nextLine();

        System.out.print("Enter description: ");
        String description = sc.nextLine();

        // Create  and store the new Expense Object and add to the Arraylist
        Expense newExpense = new Expense(expenseId++, category, amount, date, description);
        expenses.add(newExpense); // The Generic ArrayList Stores the Data

        System.out.println("Expense added successfully.");
    }

    // Method to View all recorded expenses (Read Operation)
    private static void viewExpenses(){
        if (expenses.isEmpty()) { // check the ArrayList Data Structure
            System.out.println("No Expenses found or Recorded");
        }
        else {
            System.out.println("\n List of Expenses");
            for (Expense expense : expenses) {
                System.out.println(expense);
                //Prints everything in the Data Structure Arraylist
            }
        }
    }


}


