### Concurrent Collections

<hr />

#### ConcurrentHashMap

* ConcurrentHashMap is a thread-safe variant of HashMap introduced in Java 1.5 as part of the java.util.concurrent package. 
* It's designed for concurrent access from multiple threads without the need for explicit synchronization. 
* ConcurrentHashMap achieves thread safety by partitioning the map into segments and locking only a small portion of the map during updates. 
* This approach significantly increases performance over using Collections.synchronizedMap or Hashtable, especially in scenarios with a high number of reads and writes from many threads.

* ConcurrentHashMap supports full concurrency of retrievals and adjustable expected concurrency for updates. 
* This means that any number of threads can concurrently read values without locking, while a certain number of threads can concurrently write or update values with only minimal locking. 
* The data structure uses a default concurrency level that determines the number of concurrently updating threads it supports. 
* However, the actual number of threads that can concurrently modify the map is not fixed; the map dynamically adjusts to accommodate additional threads.

Key Features:
* Thread-Safe: Can be safely accessed and modified by multiple threads without additional synchronization.
* High Performance: Locking at the granularity of segments rather than the entire map for writes, which reduces contention.
* Fail-Safe Iterators: Iterator does not throw ConcurrentModificationException if the map is modified during iteration, and it reflects the state of the map when the iterator was constructed.

<hr />

#### CopyOnWriteArrayList

* CopyOnWriteArrayList is a thread-safe variant of ArrayList found in the java.util.concurrent package. 
* It is designed for environments where read operations significantly outnumber write operations. 
* Its thread safety is achieved by making a fresh copy of the underlying array for every mutative operation (such as add or set). 
* Thus, iterators over CopyOnWriteArrayList are not affected by modifications to the list after the iterator is created - they operate on a snapshot of the list at the point in time when the iterator was created.

Key Features

* Thread-Safe: Ensures safe access by multiple threads without the need for external synchronization.
* Write Operations: On each modification, a new copy of the array is created, ensuring that the original array is not modified while being iterated over.
* Iterator Safety: Iterators do not throw ConcurrentModificationException and do not reflect additions, removals, or changes to the list after the iterator is created.

Use Cases

* Ideal for scenarios where you have a list that is frequently read but infrequently modified.
* Useful in read-heavy, multi-threaded applications where iteration over the list is a common operation.
