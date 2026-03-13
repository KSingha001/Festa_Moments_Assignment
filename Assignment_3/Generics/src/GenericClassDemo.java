class GenericClass<T> {

    private T value;

    // Method to set value
    public void setValue(T value) {
        this.value = value;
    }

    // Method to display value
    public void displayValue() {
        System.out.println("Stored Value: " + value);
    }
}

public class GenericClassDemo {

    public static void main(String[] args) {

        // Using Integer
        GenericClass<Integer> intObj = new GenericClass<>();
        intObj.setValue(100);
        intObj.displayValue();

        // Using String
        GenericClass<String> strObj = new GenericClass<>();
        strObj.setValue("Hello Java Generics");
        strObj.displayValue();
    }
}