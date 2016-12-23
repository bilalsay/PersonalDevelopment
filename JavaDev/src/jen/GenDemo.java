package jen;

class Gen<T> {
	T ob; // T tipinde bir nesne deklare et
	
	Gen(T o) {
		ob = o;
	}

	T getob() {
		return this.ob;
	}

	void showType() {
		System.out.println("Type of T is " + ob.getClass().getName());
	}
}

// Generic sınıf örneği

public class GenDemo {
	
	public static void main(String args[]) {
		// Integer ler için bir Gen referansı oluştur
		Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		
		// iOb tarafından kullanılan veri tipini göster
		iOb.showType();
		

		int v = iOb.getob();
		System.out.println("Value: " + v);

		// String ler içn bir Gen nesnesi oluştur
		Gen<String> strOb = new Gen<String>("Generic Test");

		// strOb tarafından kullanılan veri tipini göster
		strOb.showType();

		String str = strOb.getob();
		System.out.println("Value: " + str);
	}
						
}
