package chapter03;

public class exerciseOther {
	public static void main(String[] args){
		//01
		int numOfApples = 123; //사과개수
		int sizeOfBucket =10;
		int numOfBucket= (numOfApples%sizeOfBucket==0)? numOfApples/sizeOfBucket : numOfApples/sizeOfBucket+1;
		
		System.out.println("필요한 바구니의 수 :"+numOfBucket);
		
		//02
		int num=10;
				System.out.println((num==0)? "0" :(num<0)?"음수" : "양수");
				
		//03
		int num1=456;
		System.out.println((num1/100)*100);
		
		//04
		int num2=333;
		System.out.println(num2/10*10+1);
		
		//05
		int num3=10;
		System.out.println((num3%10!=0)? (num3/10+1)*10 % num3 : (num3+10)%num3);
		
		//06
		char ch='z';
		boolean b =(ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z') || (ch >= '0' && ch <= '9');
		System.out.println(b);
		
		//07
		char ch1 ='A';
		char lowerCase =(ch1 >= 'A' && ch1 <= 'Z')?(char)(ch+32):ch;
		System.out.println("ch:"+ch);
		
	}

}
