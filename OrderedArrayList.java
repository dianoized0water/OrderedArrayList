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
    super.add(where(thing), thing);
    return true;
  }

  public void add(int index, T thing){
    if (thing.compareTo(this.get(index-1))>=0 && thing.compareTo(this.get(index))<=0){
      super.add(index, thing);
    }
    else{
      throw new IllegalArgumentException();
    }
  }

  public T set(int index, T thing){
    if(!(thing.compareTo(this.get(index-1))>=0 && thing.compareTo(this.get(index+1))<=0)){
      throw new IllegalArgumentException();
    }
    super.add(index, thing);
    return super.remove(index+1);
  }
}
