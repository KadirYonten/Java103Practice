package Bölüm06;

public class AtamaDemo {

		public AtamaDemo() {
			//İlkel değerleri atama
			int j, k;
			j = 10;  // j ye 10 değeri atandı
			j = 5; // j nin ilk değeri silindi; yerine 5 atandı
			k = j; // k = 5 oldu
			System.out.println("j =  " + j);
			System.out.println("k =  " + k);
			//	        Referanslar 
			Integer i1 = new Integer("1");
			Integer i2 = new Integer("2");
			System.out.println("i1 =  " + i1);
			System.out.println("i2 =  " + i2);
			i1 = i2;
			System.out.println("i1 =  " + i1);
			System.out.println("i2 =  " + i2);
			//	        Çoklu atama
			k = j = 10; // (k = (j = 10))
			System.out.println("j =  " + j);
			System.out.println("k =  " + k);
		}
		public static void main(String args[]) {
			new AtamaDemo();
		}
	}

