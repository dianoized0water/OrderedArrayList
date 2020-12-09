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
    for (int i=0; i<this.size(); i++){
      if (thing.compareTo(this.get(i))<=0){
        return a;
      }
      else{
        a++;
      }
    }
    return a;
  }

  public boolean add(T thing){
    if (thing==null){
      throw new IllegalArgumentException();
    }
    super.add(where(thing), thing);
    return true;
  }
}
