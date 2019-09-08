package _SpiralMatrix;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		int[][] matrix = null;
		
		int rows = matrix.length;
	    if (0 == rows) {
//	    	return new ArrayList<>(0);
	    	System.out.println("0");
	    }
	    int columns = matrix[0].length;

	    List<Integer> result = new ArrayList<>(rows * columns);

	    final int layers = (Math.min(rows, columns) + 1) / 2; // number of layer.
	    for (int currentLayer = 0; currentLayer < layers ; currentLayer++) {
	        System.out.println(currentLayer);
	        int x, y;
	        // 1. Direction: right. (i, j++)
	        x = currentLayer; y = currentLayer; // (x, y) is the start point of current direction.
	        int rightBound = columns - currentLayer; // exclusive.
	        while (y < rightBound) result.add(matrix[x][y++]);

	        // 2. Direction: bottom. (i++, j)
	        x++; y--; // new start point.
	        int bottomBound = rows - currentLayer; // exclusive.
	        if (x == bottomBound) break;
	        while (x < bottomBound) result.add(matrix[x++][y]);

	        // 3. Direction: left. (i, j--)
	        x--; y--; // new start point.
	        int leftBound = currentLayer; // inclusive.
	        if (y < leftBound) break;
	        while (y >= leftBound) result.add(matrix[x][y--]);

	        // 4. Direction: up. (i--, j)
	        x--; y++; // new start point.
	        int upBound = currentLayer; // exclusive.
	        if (x == upBound) break;
	        while (x > upBound) result.add(matrix[x--][y]);
	    }
//	    return result;
	    System.out.println(result);
	}

}
