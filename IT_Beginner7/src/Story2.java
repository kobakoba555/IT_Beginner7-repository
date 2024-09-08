import java.util.Scanner;

public class Story2 {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		Magician mg = new Magician();	//魔法使いを生成（インスタンスを生成）
		System.out.println("魔法使いの名前を設定してください");	
		mg.name = scan.nextLine();
		
		System.out.println("魔法使いの体力を設定してください");	
		mg.hp = scan.nextInt();
		
		System.out.println("魔法使いの攻撃力を設定してください");	
		mg.at = scan.nextInt();
		
		System.out.println("魔法使いのMPを設定してください");	
		mg.mp = scan.nextInt();
		
		System.out.println("魔法使いが誕生した");
		System.out.println("名前:" + mg.name);
		System.out.println("体力:" + mg.hp);
		System.out.println("攻撃力:" + mg.at);
		System.out.println("MP:" + mg.mp);
		
		Scanner scan2 = new Scanner(System.in);
		
		Monster m = new Monster();	//モンスターを生成（インスタンスを生成）
		System.out.println("モンスターの名前を設定してください");	
		m.name = scan2.nextLine();
		
		System.out.println("モンスターの体力を設定してください");	
		m.hp = scan2.nextInt();
		
		System.out.println("モンスターの攻撃力を設定してください");	
		m.at = scan2.nextInt();
		
		System.out.println("モンスターの防御力を設定してください");	
		m.df = scan2.nextInt();
		
		System.out.println("モンスターが誕生した");
		System.out.println("名前:" + m.name);
		System.out.println("攻撃力:" + m.at);
		System.out.println("防御力:" + m.df);
		
		scan.close();
		scan2.close();
		
		mg.attack(m);
		mg.healMagic();
		mg.magicAttack(m);
	}
}
