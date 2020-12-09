import java.util.*;

public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{
  OrderedArrayList(){
    super();
  }

  OrderedArrayList(int InitialCapacity){
    super(InitialCapacity);
  }
}
