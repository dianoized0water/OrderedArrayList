import java.util.*;

public class NoNullArrayList<T> extends ArrayList<T>{
  NoNullArrayList(){
    super();
  }

  NoNullArrayList(int InitialCapacity){
    super(InitialCapacity);
  }

  private boolean isNull(T added){
    return added==null;
  }

  public boolean add(T thing){
    if (isNull(thing)){
      throw new IllegalArgumentException();
    }
    else {
      super.add(thing);
    }
    return true;
  }
}
