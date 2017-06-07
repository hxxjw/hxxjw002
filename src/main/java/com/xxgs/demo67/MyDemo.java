package com.xxgs.demo67;

public class MyDemo {
	// 字符
	byte byt;
	char cha;

	// 数字
	short sho;
	int in;
	long lon;

	float flo;
	double dou;

	// 逻辑
	boolean bool;
	public void intput(byte byt)
	{   
		System.out.println("初始化："+this.byt);
		System.out.println("初始化："+cha);
		System.out.println("初始化："+sho);
		System.out.println("初始化："+in);
		System.out.println("初始化："+lon);
		System.out.println("初始化："+flo);
		System.out.println("初始化："+dou);
		System.out.println("初始化："+bool);
	}
	
	
    
	public static void main(String arg[]) {
        
		MyDemo demo=new MyDemo();
		demo.intput((byte)1);
		//乘法表
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"X"+i+"="+j*i);
				System.out.print("\t");
			}
			System.out.println();
		}
     System.out.println("------------------------------");
		//倒序
		for(int h=9;h>0;h--){
			for(int f=1;f<=h;f++){
				System.out.print(h+"X"+f+"="+h*f);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}