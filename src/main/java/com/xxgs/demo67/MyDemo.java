package com.xxgs.demo67;

public class MyDemo {
	// �ַ�
	byte  byt;
	char cha;

	// ����
	short sho;
	int in;
	long lon;

	float flo;
	double dou;

	// �߼�
	boolean bool;
	public void intput(byte byt)
	{   
		System.out.println("��ʼ����"+this.byt);
		System.out.println("��ʼ����"+cha);
		System.out.println("��ʼ����"+sho);
		System.out.println("��ʼ����"+in);
		System.out.println("��ʼ����"+lon);
		System.out.println("��ʼ����"+flo);
		System.out.println("��ʼ����"+dou);
		System.out.println("��ʼ����"+bool);
	}
	
	
    
	public static void main(String arg[]) {
        
		MyDemo demo=new MyDemo();
		demo.intput((byte)1);
		//�˷���
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+"X"+i+"="+j*i);
				System.out.print("\t");
			}
			System.out.println();
		}
     System.out.println("------------------------------");
		//����
		for(int h=9;h>0;h--){
			for(int f=1;f<=h;f++){
				System.out.print(h+"X"+f+"="+h*f);
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}