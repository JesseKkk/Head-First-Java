public class PhraseOMtic1
{
	public static void main(String[] args)
	{
		
		//�ҵ��������ɻ�
		String[] wordListOne  = {"kong", "liu"};
		String[] wordListTwo = {"jin", "jing"};
		String[] wordListThree ={"xing", "kang"};
		
    
		//����ÿ���ж�������
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength = wordListThree.length;

		//���������
		int rand1 = (int) (Math.random() * oneLength);	
		int rand2 = (int) (Math.random() * twoLength);		
		int rand3 = (int) (Math.random() * threeLength);

		//��ϳ�����
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		
		//���
		System.out.println("What we need is a " + phrase);
	}

}