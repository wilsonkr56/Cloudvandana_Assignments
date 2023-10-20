import java.util.Random;

public class ShuffleArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        Random rand = new Random();

        for (int i = array.length - 1; i > 0; i--) {
            int randomIndex = rand.nextInt(i + 1);
            int temp = array[i];
            array[i] = array[randomIndex];
            array[randomIndex] = temp;
        }

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}
