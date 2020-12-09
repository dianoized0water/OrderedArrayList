import java.util.*;

public class NoNullArrayList<T> extends ArrayList<T>{
  NoNullArrayList(){
    super();
  }

  NoNullArrayList(int InitialCapacity){
    super(InitialCapacity);
  }

  public boolean add(T thing){
    if (null==thing){
      throw new IllegalArgumentException();
    }
    else {
      super.add(thing);
    }
    return true;
  }

  public void add(int index, T thing){
    if (null==thing){
      throw new IllegalArgumentException();
    }
    else {
      super.add(index, thing);
    }
  }

  public T set(int index, T thing){
    if (null==thing){
      throw new IllegalArgumentException();
    }
    return super.set(index, thing);
  }
}
