package com.src.designpattern.singleton;

public class MySingleton {
	
	private  volatile static MySingleton mySingletonInstance;

	private MySingleton(){
	};
	
	
	public static  MySingleton getInstance(){
		
		if(mySingletonInstance == null){
			synchronized (MySingleton.class) {
				if(mySingletonInstance == null){
					mySingletonInstance = new MySingleton();
				}
			}
		}
		
		return mySingletonInstance;
	}
	
	public static void main(String[] args){
		MySingleton singleton = MySingleton.getInstance();
		System.out.println(singleton.hashCode());
		
		MySingleton singleton1 = MySingleton.getInstance();
		System.out.println(singleton1.hashCode());
		
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				
				for(int i=0 ; i< 10 ; i++){
					System.out.println(MySingleton.getInstance().hashCode());
				}
				
			}
		});
		
		t1.start();
	}

}
