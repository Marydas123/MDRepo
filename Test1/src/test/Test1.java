package test;
import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer; 
class Test1<T> implements Iterable<T> ,Iterator<Object>
{
	
	public transient T data[] ;
	private int size =10;
	private int modCount =0;
	public static void main(String[] args) {
		Test1<String> s = new Test1<String>();
		s.addel("dfdfchc");
		
		for(String l :s) {
			
			System.out.println(l);
			
		}
		
	}
	
	public void forEach(Consumer<? super T> action) 
	{
	    Objects.requireNonNull(action);
	 
	    final int expectedModCount = modCount;
	 
	    @SuppressWarnings("unchecked")
	    final T[] elementData = (T[]) this.data;
	    final int size = this.size;
	    for (int i=0; modCount == expectedModCount && i < size; i++) {
	        action.accept(elementData[i]);
	    }
	   
	}

	public void addel(T e) {
		if(modCount==0) {
			data =(T[]) new Object[modCount];
		}
		
		if(size >modCount) {
			
			 data= Arrays.copyOf(data,data.length+1);
			 data[modCount++] = e;
			
		}
		
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		
		return false;
	}

	@Override
	public Object next() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterator iterator() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}

	
