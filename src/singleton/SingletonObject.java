package singleton;

public class SingletonObject {
	
	public static SingletonObject singletonObject = new SingletonObject();
	
	private SingletonObject(){
		
	}
	
	public static SingletonObject getInstance(){
		return singletonObject;
	}
	
	

}
