
public class Hero {

	String name;	//名前
	int hp;			//体力
	int at;			//攻撃力
	int df;			//防御力
	
	void attack() {//攻撃
		System.out.println(this.name + "の攻撃！");
		System.out.println("敵にダメージを" + this.at + "与えた！！");
	}
	
	void defence() {//防御
		System.out.println("勇者が防御をした");
		this.df = this.df + 10;
		System.out.println("防御力が10upし、" + this.df + "になった");
	}

	void heal() {//回復
		System.out.println("勇者が休憩した");
		this.hp = this.hp + 10;
		System.out.println("hpが10回復し、" + this.hp + "になった");
	}
}
