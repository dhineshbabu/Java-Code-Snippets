### Cached Thread Pool

The Cached Thread Pool creates threads as needed and reuses them when they become available. It doesn’t have a fixed number of threads and can create new threads as needed. However, if a thread is idle for a certain period of time, it is terminated and removed from the pool.

<hr />

### Fixed Thread Pool

The Fixed Thread Pool has a fixed number of threads that are created when the thread pool is initialized. Once a thread is created, it remains in the pool until the thread pool is shut down. If a new task is submitted and all the threads are busy, the task is added to a queue and waits for an available thread.

<hr />

### Single Thread Executor

The Single Thread Executor has only one thread in the pool. It executes tasks sequentially, one at a time. If a task is submitted to the thread pool and the thread is busy, the task is added to a queue and waits for the thread to become available

<hr />

### Scheduled Thread Pool

The Scheduled Thread Pool is similar to the Fixed Thread Pool, but it is designed for executing tasks at a specific time or repeatedly at a fixed interval. You can use it to schedule tasks to run at a certain time or to repeat at a certain interval.

<hr />
