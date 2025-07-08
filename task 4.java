//Name:Michael Antigua
//CMSC 203
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
