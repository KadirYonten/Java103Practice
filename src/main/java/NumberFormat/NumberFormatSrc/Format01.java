/*
* Bu program kesirli sayıları Türkçe standardına göre yazar
*/

package sayıBiçemleme;

import java.text.NumberFormat;

public class Format01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		double[] dizi =  {8, 12345678, 11.3,25.67,36.12345,40.0,58.987654};
		NumberFormat nf = NumberFormat.getInstance();
		for (int i = 0; i < dizi.length; ++i) {
			System.out.println(nf.format(dizi[i]) );
		}
	}
}
/*
8
12.345.678
11,3
25,67
36,123
40
58,988
*