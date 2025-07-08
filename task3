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
