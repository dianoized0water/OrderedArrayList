import java.util.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  OrderedArrayList(){
    super();
  }

  OrderedArrayList(int InitialCapacity){
    super(InitialCapacity);
  }

  private int where(T thing){
    int a = 0;
    while (a < this.size()){
      if (thing.compareTo(this.get(a))>0){
        a++;
      }
      else {
        return a;
      }
    }
    return a;
  }

  public boolean add(T thing){
    if (thing == null){
      throw new IllegalArgumentException();
    }
    super.add(where(thing), thing);
    return true;
  }

  public void add(int index, T thing){
      add(thing);
  }

  public T set(int index, T thing){
    if (thing == null){
      throw new IllegalArgumentException();
    }
    T removed = super.remove(index);
    super.add(where(thing), thing);
    return removed;
  }
}
