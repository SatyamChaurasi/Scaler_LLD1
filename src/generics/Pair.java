package generics;

public class Pair<A,B> {
	public A first;
	public B second;
	public int third;
	
	public Pair() {
		
	}
	
	public Pair(A first,B second) {
		this.first = first;
		this.second = second;
	}
	
	public void print(A a,B b) {
		System.out.println(a+ " -> "+b);
	}

	public void print(A a,B b,int c) {
		System.out.println(a+ " -> "+b+ " -> " + c);
	}
	
	public A doSomething(A a, B b) {
        return a;
    }
	
	
}
