package fileImport;

public class myFileUtils {
	
	public int substract10FromLargerNumber(int number) throws Exception {
		if(number<10) {
			throw new Exception("The number passed was smaller than 10");
		}
		return number-10;
	}
}
