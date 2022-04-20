package chapter_fourteen;

import java.util.ArrayList;


public class PriorityQueue<T>
{
    private ArrayList<T> queue = new ArrayList<>();
    private ArrayList<Integer> priorities = new ArrayList<>();


    /** Bubble Sort */
    private void sort()
    {
        boolean needNextIteration = true;
        while (needNextIteration)
        {
            needNextIteration = false;
            for (int i = 0; i < queue.size()-1; i++)
            {
                if (priorities.get(i) < priorities.get(i+1))
                {
                    T temp = queue.get(i);
                    queue.set(i, queue.get(i+1));
                    queue.set(i+1, temp);

                    int temp_ = priorities.get(i);
                    priorities.set(i, priorities.get(i+1));
                    priorities.set(i+1, temp_);
                    needNextIteration = true;
                }
            }
        }
    }

    public void add(T item, int priority)
    {
        priorities.add(priority);
        queue.add(item);
        sort();
    }

    public T remove()
    {
        if (priorities.isEmpty())
            return null;
        priorities.remove(0);
        return queue.remove(0);
    }

}
