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
    else {
      return super.add( element);
    }
  }

  public void add(int index,  T element) {
    if ( element == null)
    throw new IllegalArgumentException("cannot add null");
    else
    super.add( index, element);
  }

  public T set(int index, T element) {
    if ( element == null)
    throw new IllegalArgumentException("cannot set null");
    else {
      return super.set( index, element);
    }
  }
}
