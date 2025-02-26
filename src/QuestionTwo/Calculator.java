

package QuestionTwo;

public class Calculator {

    public void calculate() {
        System.out.println("Performing a general calculation ..");

    }

    // Overloaded method to display details
    public void displayDetails() {
        System.out.println("This is a basic calculator.");
    }

    public void displayDetails(String calculatorType) {
        System.out.println("This is a " + calculatorType + " calculator.");
    }


    public class ScientificCalculator extends Calculator {


        public void calculate() {
            System.out.println("Performing scientific computations like trigonometry.");
        }
    }


    public class FinancialCalculator extends Calculator {


        public void calculate(){
            System.out.println("Performing financial operations like interest calculation..");
        }
    }

    public class  RuntimePolymorphism {
        public static void demonstratePolymorphism(Calculator calculator) {
            calculator.calculate();
        }
    }

}
