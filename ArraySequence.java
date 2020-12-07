import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int[] data;


  public ArraySequence(int [] other){
    data = other;
    currentIndex = 0;
  }
  public boolean hasNext() {
    return currentIndex < data.length;
  }
  public int length() {
    return data.length;
  }
  public void reset() {
    currentIndex = 0;
  }
}
