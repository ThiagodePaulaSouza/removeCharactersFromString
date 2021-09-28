public class Main {

	public static void main(String[] args) {
		removeCharsFromString rmString = new removeCharsFromString();
		
		String teste = "era uma vez um cachorro que latia muito porem houve um dia que ele latiu tao alto que morreu";
		
		System.out.println(rmString.removeCharsFromString(teste, "a,e,i,o,u", ","));
	}
}
