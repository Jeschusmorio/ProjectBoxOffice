import java.io.IOException;
import java.util.ArrayList;

public class BoxOfficeMain {

	public static void main(String[] args) throws IOException {
		/*
		ArrayList<ArrayList<String>> data2020 = MovieScraper.ScrapeByYear(2020);
		double[] domestic2020 = CalcData.castToDoubleArray(data2020.get(2), true);
		double[] percentDom2020 = CalcData.castToDoubleArray(data2020.get(3), false);
		double[] d = CalcData.castToDoubleArray(data2020.get(0), true);
		System.out.println(d.length);
		for (int i = 0; i < domestic2020.length; i++) {
			System.out.println(domestic2020[i]);
		}
		String s = CalcData.formatMoneyNumber("$419,074,646");
		System.out.println(s);
		String s = CalcData.formatPercentNumber("48.8%");
		System.out.println(s);
		double[] test = {10.8, 20.3, 14.2};
		System.out.println(CalcData.sum(test));
		System.out.println(CalcData.avg(test));
		*/
		Year y2020 = new Year(2020);
	}

}
