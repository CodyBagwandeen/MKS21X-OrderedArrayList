import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList( int startSize){
    super( startSize);
  }

  public OrderedArrayList() {
    super();
  }

  public boolean add( T element) {
    super.add( newIndex(element), element);
    return true;
  }

  public void add( int index, T element) {
    add( element);
  }

  public T set( int index, T element) {
    if ( element == null)
    throw new IllegalArgumentException("element cannot be null");
    T temp = get(index);
    remove(index);
    add( element);
    return temp;
  }

  private int newIndex( T element) {
    int output = 0;
    for ( int x = 0; x < size(); x++) {
      if( element.compareTo(get(x)) < 0 )  {
        output = x;
        return output;
      }
    }
    return output;
  }
}
