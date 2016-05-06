public class Main {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
        try {

            int[] array = {5, 6, 7, 3, 3, 9, 7, 7, 4,};
            /**
             * Look for this value
             */
            int three = 3;
            /**
             * Loop through this array for 3 consecutive threes. If no such three values exist,
             * there will be an exception thrown when there is nothing else available. See below.
             */
            for (int i = 0; i <= array.length; i++) {
                if (array[i] == 3) {
                    /**
                     * If this is the final iteration, this array is out of bounds because there is no
                     * i[9]. Exception must be caught.
                     */
                    if (array[i + 1] == 3) {
                        if (array[i + 2] == 3) {
                            System.out.println("1");
                            break;
                        }

                    }
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("There are no consecutive threes");
        }
    }
}




