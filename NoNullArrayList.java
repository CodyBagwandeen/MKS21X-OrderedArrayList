import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T> {


  public NoNullArrayList( int startSize) {
    super(startSize);
  }

  public NoNullArrayList() {
    super();
  }
  public T set(int index, T value) {
      public<T> = get(index);
      if ( value == null)
      throw new IllegalArgumentException( "null cannot be set");
      super.set( index, value);

    }
}
