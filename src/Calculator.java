public class Calculator {

    // fonction add qui prend plusieurs paramètres et retourn l'addition de ces paramètres
    public static int add(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    // fonction sub qui prend plusieurs paramètres et retourn la soustraction de ces paramètres
    public static int sub(int... numbers) {
        int sum = 0;
        for (int number : numbers) {
            sum -= number;
        }
        return sum;
    }
}
