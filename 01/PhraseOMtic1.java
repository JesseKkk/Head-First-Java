public class PhraseOMtic1
{
	public static void main(String[] args)
	{
		
		//我的名字生成机
		String[] wordListOne  = {"kong", "liu"};
		String[] wordListTwo = {"jin", "jing"};
		String[] wordListThree ={"xing", "kang"};
		
    
		//计算每组有多少术语
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		//产生随机数
		int rand1 = (int) (Math.random() * oneLength);	
		int rand2 = (int) (Math.random() * twoLength);		
		int rand3 = (int) (Math.random() * threeLength);

		//组合出名字
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		
		//输出
		System.out.println("What we need is a " + phrase);
	}

}