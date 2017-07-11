package pkg;

public class Test {
	static int SelectBball() {
		int Bball;
		Bball = (int)(Math.random() * 16) + 1;	
		return Bball;
	}
	static int[] SelectRball() {
		int Rball[] = new int[6];
		int[] picks = new int[6];
		for(int i = 0; i < picks.length; i++)
			picks[i] = -1;
		for(int i = 0; i < picks.length; i++)
			retry:
				while(true) {
					int t = (int)(Math.random() * 33) + 1;
					for(int j = 0; j < i; j++)
						if(picks[j] == t) continue retry;
					picks[i] = t;
					Rball[i] = t;
					break;
				}
		return Rball;
	}
	
	public static void main(String[] args) {
		Sytem.out.println("随机双色球：");
		int[] Rball = SelectRball(); 
		int Bball = SelectBball();
		for(int i = 0; i < 6; i++)
			System.out.print("  " + Rball[i]);
		System.out.println(" -- " + Bball);		
	}
}
