

package QuestionTwo;

public class Calculator {

    public void culculate(){
        System.out.println("Performing a general calculation ..");

    }

    // Overloaded method to display details
    public void displayDetails() {
        System.out.println("This is a basic calculator.");
    }

    public void displayDetails(String calculatorType) {
        System.out.println("This is a " + calculatorType + " calculator.");
    }

}

