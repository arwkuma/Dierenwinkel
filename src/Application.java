import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Abstract keyword - kan je geen object van maken
		//Dier dier1 = new Dier();
		
		Hond h = new Hond();
		h.name = "Woefie";
		h.type = "Kortharig";
		h.age = 5;
		h.tail = true;
		h.flying = false;
		h.makeSound();
		h.callSound();
				
		Kat k = new Kat();
		k.name = "Felix";
		k.type = "Langharig";
		k.age = 13;
		k.tail = false;
		k.flying = false;
		k.makeSound();
		k.callSound();
		
		Vogel v = new Vogel();
		v.name = "Sambal";
		v.type = "veren";
		v.age = 2;
		v.tail = true;
		v.flying = true;
		v.makeSound();
		v.callSound();
		
		//Array
		//Array Map Set List
		
		//List<Dier> dieren = new ArrayList<>();
		//dieren.add(h);
		//dieren.add(k);
		//dieren.add(v);
		
		//dieren.forEach(dier -> {
			//dier.makeSound();
		//});
				
	}

}
