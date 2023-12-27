package Exercises;

public class MethodTest {

    public static void main(String[] args) {
        CustomObject first = new CustomObject();
        first.value = 10;
        System.out.println("object before method: " + first);
        changeObject(first);
        System.out.println("object after method: " + first);
    }

    private static void changeObject(CustomObject first) {
        first = new CustomObject();
        first.value = 20;

        System.out.println("object in method: " + first);
    }
}

class CustomObject {
    int value;

    @Override
    public String toString() {
        return "CustomObject{" +
                "value=" + value +
                '}';
    }
}
