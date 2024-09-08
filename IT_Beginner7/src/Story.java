
import java.util.Scanner;

public class Story {
	
	public static void main(String args[]) {
		
		Scanner scan = new Scanner(System.in);
		
		Hero h = new Hero();	//勇者を生成（インスタンスを生成）
		System.out.println("勇者の名前を設定してください");	
		h.name = scan.nextLine();
		
		System.out.println("勇者の体力を設定してください");	
		h.hp = scan.nextInt();
		
		System.out.println("勇者の攻撃力を設定してください");	
		h.at = scan.nextInt();
		
		System.out.println("勇者の防御力を設定してください");	
		h.df = scan.nextInt();
		
		System.out.println("勇者が誕生した");
		System.out.println("名前:" + h.name);
		System.out.println("攻撃力:" + h.at);
		System.out.println("防御力:" + h.df);
		
		Scanner scan2 = new Scanner(System.in);
		
		Monster m = new Monster();	//勇者を生成（インスタンスを生成）
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
		
	}
}
