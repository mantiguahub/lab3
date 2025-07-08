//Name: Michael Antigua
//Cmsc 203
public void printArray() {
    for (int row = 0; row < intArray.length; row++) {
        for (int column = 0; column < intArray[0].length; column++) {
            System.out.print(intArray[row][column] + " ");
            animate(row, column);
        }
        System.out.println();
    }
}
