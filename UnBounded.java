package generic;




//Upper Bound Generic Type
class Traingle<T> {

 private T obj;

 public void set(T obj) {
     this.obj = obj;
 }

 public T get() {
     return this.obj;
 }
}

public class UnBounded {

 // Upper bounded wildcard
 // T must be Number or a subclass of Number
 public static void print(Traingle<? extends Number> b) {

     Number obj = b.get();  //Imp Mention a class

     System.out.println(obj);
 }

 public static void main(String[] args) {

     // Number -> ✅ Allowed
     Traingle<Number> b1 = new Traingle<Number>();

     // Integer -> ✅ Allowed because Integer extends Number
     Traingle<Integer> b2 = new Traingle<Integer>();

     // Double -> ✅ Allowed because Double extends Number
     Traingle<Double> b3 = new Traingle<Double>();

     // Object -> ❌ Cannot be passed to print()
     Traingle<Object> b4 = new Traingle<Object>();

     // Boolean -> ❌ Cannot be passed to print()
     Traingle<Boolean> b5 = new Traingle<Boolean>();

     // String -> ❌ Cannot be passed to print()
     Traingle<String> b6 = new Traingle<String>();


     // Setting values
     b1.set(101);
     b2.set(200);
     b3.set(25.5);


     // Getting values
     System.out.println("Number value: " + b1.get());
     System.out.println("Integer value: " + b2.get());
     System.out.println("Double value: " + b3.get());


     // Calling print()
     System.out.println("\nUsing print():");

     print(b1);  // ✅ Number
     print(b2);  // ✅ Integer
     print(b3);  // ✅ Double


     // These would give compilation errors:
     // print(b4);  // ❌ Object is not a subclass of Number
     // print(b5);  // ❌ Boolean is not a subclass of Number
     // print(b6);  // ❌ String is not a subclass of Number
 }
}
// Unbounded Generic Type
/*
 * class Traingle<T> {
 * 
 * private T obj;
 * 
 * public void set(T obj) { this.obj = obj; }
 * 
 * public T get() { return this.obj; }
 * 
 * @Override public String toString() { return String.valueOf(obj); } }
 * 
 * public class UnBounded {
 * 
 * // Unbounded wildcard public static void print(Traingle<?> b) { Object obj =
 * b.get(); System.out.println(obj); }
 * 
 * public static void main(String[] args) {
 * 
 * Traingle<Number> b1 = new Traingle<Number>();
 * 
 * b1.set(101);
 * 
 * System.out.println("Value using get(): " + b1.get());
 * 
 * 
 * } }
 */