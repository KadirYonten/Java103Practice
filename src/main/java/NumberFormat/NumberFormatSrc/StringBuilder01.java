
public class StringBuilder01 {

	public StringBuilder01() {
		String s;
	}

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();
		int i = 42;
		sb.append("Çýktý : ");
		sb.append(i);      // i sayýsýný stringe dönüþtürür ve sb ye ekler
		sb.append(", ");
		sb.append(1.0/3.0);
		System.out.println(sb);
		System.out.println(sb.toString());
		String s = sb.toString(); 
		System.out.println(s);

	}

}
/*
Çýktý : 42, 0.3333333333333333
Çýktý : 42, 0.3333333333333333
Çýktý : 42, 0.3333333333333333
*/