 package Pair;

public class PairTest1 {

	public static void main(String[] args) {
		String[] words={"Mary","had","a","little","lamb"};
		Pair<String> mm=ArrayAlg.minmax(words);
		System.out.println(mm.getFirst());
		System.out.println(mm.getSecond());
		
		String middle1=ArrayAlg.getMiddle("John","Q","public");
		//���������T����String����
		System.out.println(middle1);
		//���������Զ��������Ϊ1��Double��2��Integer���󣬶���ȥѰ�����ǵĹ�ͬ�ĸ��ࡣ
		//����ʵ�ϱ������ҵ���2�������ĸ��ࣺNumber��Comparable,�޷�׼ȷ�ƶϳ��������ͣ����Գ���
		double middle2=ArrayAlg.getMiddle(3.14,0,1927);
	}

}

class ArrayAlg{
	public ArrayAlg(){}
	public static  Pair<String> minmax(String[] a){
		if(a==null|a.length==0) return null;
		String min=a[0];
		String  max=a[0];
		for( int i=0;i<a.length;i++){
			if(min.compareTo(a[i])>0) min=a[i];
			if(max.compareTo(a[i])<0) max=a[i];
		}
		return new Pair<>(min,max);
	}
	
	public static <T> T getMiddle(T...a){
		return a[a.length/2];
	}
	/*
	public static <T> Pair<T> minmax(T[] a){
	//public static <T extends Comparable> Pair<T> minmax(T[] a){
		if(a==null|a.length==0) return null;
		T min=a[0];
		T  max=a[0];
		for( int i=0;i<a.length;i++){
			if(min.compareTo(a[i])>0) min=a[i];
			if(max.compareTo(a[i])<0) max=a[i];
		}
		return new Pair<>(min,max);
	}*/
}
