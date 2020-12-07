import java.util.NoSuchElementException;
public class ArraySequence implements IntegerSequence{
  int currentIndex;
  int[] data;


  public ArraySequence(int [] other){
    data = other;
    currentIndex = 0;
  }
  public ArraySequence(IntegerSequence other) {
    data = new int[other.length()];
    for (int i = 0; other.hasNext() == true; i++) {
      data[i] = other.next();
    }
    other.reset();
  }
  public boolean hasNext() {
    return currentIndex < data.length;
  }
  public int next() {
    if (hasNext() == false) {
      throw new NoSuchElementException("No elements left in sequence.");
    }
    currentIndex++;
    return data[currentIndex-1];
  }
  public int length() {
    return data.length;
  }
  public void reset() {
    currentIndex = 0;
  }
}
