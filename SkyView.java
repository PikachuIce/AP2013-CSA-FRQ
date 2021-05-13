
public class SkyView {
	private double[][] scanArr;
	/**
	 * Constructs a SkyView object from a 1-dimensional array of scan data 
	 * @param numRows
	 * @param numCols
	 * @param scanned
	 */
	public SkyView(int numRows, int numCols, double[] scanned) {
		int count = 0;
		scanArr = new double[numRows][numCols];
		for(int i = 0; i < numRows; i++) {
			for(int j = 0; j < numCols; j++) {
				scanArr[i][j] = scanned[count];
				count++;
			}
		}
	}
	public double getAverage(int startRow, int endRow, int startCol, int endCol) {
		double total = 0;
		int numCount = 0;
		for(int i = startRow; i <= endRow; i++) {
			for(int j = startCol; j <= endCol; j++) {
				total += scanArr[i][j];
				numCount++;
			}
		}
		return total/numCount;
	}
}
