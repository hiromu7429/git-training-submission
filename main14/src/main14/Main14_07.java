package main14;

//名前が同じなら同じ勇者とするequals()を定義
public class Main14_07 {
	String name;
	int hp;

	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Hero h) {
			if (this.name.equals(h.name)) {
				return true;
			}
		}
		return false;
	}
}
