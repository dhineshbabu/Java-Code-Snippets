### Collections Framework
<hr />

Implementations
List: ArrayList, Linked List
<hr/>

#### Collection(I) interface

public interface Collection<E> extends Iterable<E>
{
int size();
boolean isEmpty();
boolean contains(Object o);
boolean add(E e);
boolean remove(Object o);
Iterator<E> iterator();
Object[] toArray();
T[] toArray(T[] arr);
Stream<E> stream();
Stream<E> parallelStream();

// Bulk Operations
boolean containsAll(Collection<?> c);
boolean addAll(Collection<? extends E> c);
boolean removeAll(Collection<?> c);
boolean removeIf(Predicate<? super E> filter);
}

<hr/>
#### Iterable(I) interface
* boolean hasNext();
* E next();
* void remove();
<hr/>

### toArray() method
* to convert given collection to arrays
  * method1: Object[] toArray()
  * method2: T[] toArray(T [])

<hr/>

### Streams in Java
* intermediate function, terminal function
* NO storage, pipeline of functions, can be infinite, can be parallelized
* can be created from collections, arrays, Files lines, methods in stream, IntStream, etc.

### List Interface Methods
* get(indx)
* set(index, value)
* indexOf(o)
* listIterator()
  * hasPrevious()
  * previous()
  * add()
  * set()
  * nextIndex()
  * previousIndex()
* listIterator(int index)
* remove(int index)

#### ArrayList
  *  we can create an arraylist from capacity as well
  *  internally it uses array only
  *  we can set the size by ensure capacity
  * Amortized time complexity for inserting n+1 items
    * ø(1)+ø(1)...+ø(1)+ø(n) / (n+1)
    * (ø(n) + ø(n)) / n+1
    * ø(1)
  * methods:
    * add(object)
    * add(index, object)
    * contains(object)
    * remove(index)
    * remove(object)
    * get(index)
    * set(index, obj)
    * indexOf(obj) - returns first occurrence
      * returns -1 if not found
    * lastIndexOf(obj)
      * returns -1 if not found
    * clear()
    * isEmpty()
    * ArrayList Traversal
      * extended for loop
      * Iterators
        * ```Iterator it = al.iterator()```
        * we will not receive CCM exception
      * using forEach method
        * ```al.forEach(x->System.out.println(x));```