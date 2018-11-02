import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {


  public NoNullArrayList( int startSize) {
    super(startSize);
  }

  public NoNullArrayList() {
    super();
  }

  public boolean add( T element) {
    if ( element == null)
    throw new IllegalArgumentException("cannot add null");
    super.add( element);
    return true;
  }

  public void add(int index,  T element) {
    if ( element == null)
    throw new IllegalArgumentException("cannot add null");
    super.add( index, element);
  }

  public T set(int index, T element) {
    if ( element == null)
    throw new IllegalArgumentException("cannot set null");
    T temp = get(index);
    super.set( index, element);
    return temp;
  }
}
