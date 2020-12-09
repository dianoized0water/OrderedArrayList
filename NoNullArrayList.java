import java.util.*;

public class NoNullArrayList<T> extends ArrayList<T>{
  NoNullArrayList(){
    super();
  }

  NoNullArrayList(int InitialCapacity){
    super(InitialCapacity);
  }
}
