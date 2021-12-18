package week6;

public class Ex98 {
    public static void main(String[] args) {
        // write testcode here
    }

    public static int[] copy(int[] array) {
        int[] arrayCopy = new int[array.length];

        for(int i = 0; i < array.length; i++)
            arrayCopy[i] = array[i];

        return arrayCopy;
    }

    public static int[] reverseCopy(int[] array) {
        int[] arrayReverse = new int[array.length];
        int j = array.length -1;

        for(int i = 0; i< array.length; i++) {
            arrayReverse[j] = array[i];
            j--;
        }
        return arrayReverse;
    }
}
