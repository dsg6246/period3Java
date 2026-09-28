// public class Main {
//     public static void main(String[] args) {
//     //    System.out.println("Welcome to the Interest Calculator!");
//     //    Loan loan1 = new Loan(1000, 10, 1, 12);
//     //    System.out.println("Loan 1: Simple Interest: $" + loan1.calculateSimpleInterest());
//     //     System.out.println("Loan 1 Total Repayment: $" + loan1.calculateTotalRepayment());    

//     // Loan loan2 = new Loan(5000, 6.75, 12.5, 4);
//     //    System.out.println("Loan 2: Simple Interest: $" + loan2.calculateSimpleInterest());
//     //     System.out.println("Loan 2 Total Repayment: $" + loan2.calculateTotalRepayment());    



//      // TODO: write for all customers 

//             Customer c = Customer.generateRandom();
//             System.out.println("--- Customer " + 1 + " ---");
//             System.out.println("Name: " + c.getName());
//             System.out.println("Credit Score: " + c.getCreditScore());
//             System.out.println("Loan: $" + String.format("%.2f", c.getLoanAmount()));
//             System.out.println("Defaulted? " + c.determineDefault());
//             System.out.println();

//     }
    


// }

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // TODO: Create a Bank object with a starting balance of 5000
        
        // TODO: Print the starting balance, formatted to 2 decimal places
        // Example format: "Starting Balance: $5000.00"
        
        for (int turn = 1; turn <= 10; turn++) {
            System.out.println("\n--- Turn " + turn + " ---");
            
            // TODO: 1. Spawn a random customer using Customer.generateRandom()
            
            // TODO: Print the customer's name and story
            
            // TODO: Print the customer's requested loan amount, formatted to 2 decimal places
            
            // TODO: Print the customer's credit score
            
            // TODO: 2. Ask the user to approve or deny the loan
            // Print "Approve this loan? (y/n): " and read the user's input using scanner.nextLine()
            // Clean up the input (trim whitespace, convert to lowercase) so "Y", " y ", etc. all work
            
            // TODO: 3. If the user approved the loan (typed "y"):
            //   Try to withdraw the loan amount from the bank
            //   If the withdrawal succeeds:
            //     - Create a new Loan object using the customer's loan amount, interest rate, years, and 12 (months per year)
            //     - Determine if the customer defaults using customer.determineDefault()
            //     - If they defaulted: print that they defaulted and how much money was lost
            //     - If they did NOT default: 
            //         - calculate the total repayment using the loan
            //         - deposit that repayment back into the bank
            //         - print how much they paid back
            //   If the withdrawal fails:
            //     - Print a message saying there isn't enough money to lend
            // 
            // If the user denied the loan (typed anything else):
            //   - Print a message saying the loan was denied and no money was lent
            
            // TODO: Print the bank's current balance after this turn, formatted to 2 decimal places
        }
        
        System.out.println("\n--- GAME OVER ---");
        // TODO: Print the final balance, formatted to 2 decimal places
        
        scanner.close();
    }
}
        

