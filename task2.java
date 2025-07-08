//Name:Michael Antigua
//CMSC 203
public void setValues(int value, int row) {
    for (int column = 0; column < intArray[0].length; column++) {
        intArray[row][column] = value;
        animate(row, column);
    }
}
