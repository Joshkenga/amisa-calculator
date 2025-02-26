package QuestionTwo;

class Calculator {
    public void calculate() {
        System.out.println("Performing a general calculation...");
    }

    public void displayDetails() {
        System.out.println("This is a basic calculator.");
    }

    public void displayDetails(String calculatorType) {
        System.out.println("This is a " + calculatorType + " calculator.");
    }
}

class ScientificCalculator extends Calculator {
    @Override
    public void calculate() {
        System.out.println("Performing scientific computations like trigonometry.");
    }
}

class FinancialCalculator extends Calculator {
    @Override
    public void calculate() {
        System.out.println("Performing financial operations like interest calculation.");
    }
}

class RuntimePolymorphism {
    public static void demonstratePolymorphism(Calculator calculator) {
        calculator.calculate();
    }
}

// Main class

class CalculatorProgram {
    public static void main(String[] args) {
        // Creating objects of subclasses
        FinancialCalculator fin = new FinancialCalculator();
        ScientificCalculator sci = new ScientificCalculator();

        // Demonstrating method overriding
        fin.calculate();
        sci.calculate();
        System.out.println("____________________________________");

        // Demonstrating method overloading
        sci.displayDetails();
        sci.displayDetails("Scientific");
        fin.displayDetails();
        fin.displayDetails("Financial");
        System.out.println("____________________________________");

        // Demonstrating runtime polymorphism
        RuntimePolymorphism.demonstratePolymorphism(sci);
        RuntimePolymorphism.demonstratePolymorphism(fin);
    }
}
