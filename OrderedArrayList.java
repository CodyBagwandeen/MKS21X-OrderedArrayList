import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList( int startSize){
    super( startSize);
  }

  public OrderedArrayList() {
    super();
  }

  public boolean add(T e) {
    for(int i=0; i<size(); i++) {
      if(e.compareTo(get(i)) <= 0) {
        super.add(i,e);
        return true;
      }
    }
    return super.add(e);
  }

  public void add( int index, T element) {
    add( element);
  }

  public T set(int index, T e) {
    T output = remove(index);

    add(e);

    return output;

  }



}
