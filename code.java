public class TwoDimArrayPractice {
    private int[][] intArray = new int[4][20];

   
    public void fillValues() {
        for (int row = 0; row < intArray.length; row++) {
            for (int column = 0; column < intArray[0].length; column++) {
                intArray[row][column] = (int)(Math.random() * 31) + 50; 
                animate(row, column);
            }
        }
    }

    
    public void printArray() {
        for (int row = 0; row < intArray.length; row++) {
            for (int column = 0; column < intArray[0].length; column++) {
                System.out.print(intArray[row][column] + " ");
                animate(row, column);
            }
            System.out.println();
        }
    }

   
    public void setValues(int value, int row) {
        for (int column = 0; column < intArray[0].length; column++) {
            intArray[row][column] = value;
            animate(row, column);
        }
    }

    public int findMinimum(int column) {
        int min = intArray[0][column];
        for (int row = 1; row < intArray.length; row++) {
            if (intArray[row][column] < min) {
                min = intArray[row][column];
            }
            animate(row, column, min);
        }
        return min;
    }

   
    public int countFound(int value) {
        int count = 0;
        for (int row = 0; row < intArray.length; row++) {
            for (int column = 0; column < intArray[0].length; column++) {
                if (intArray[row][column] == value) {
                    count++;
                }
                animate(row, column, count);
            }
        }
        return count;
    }

  
    public void animate(int row, int column) { /* ... */ }
    public void animate(int row, int column, int intermedResult) { /* ... */ }
}
