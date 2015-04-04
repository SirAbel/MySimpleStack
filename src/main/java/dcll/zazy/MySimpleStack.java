package dcll.zazy;

import java.util.EmptyStackException;

/**
 * Created by Abel on 02/03/15.
 */
public interface MySimpleStack {
    /**
     * Tests if this stack is empty.
     *@return a boolean depending on whether the stack is empty or not.
     * */
    boolean isEmpty();
    /**
     * Returns the number of items in this stack.
     * @return starck size.
     * */
    int getSize();
    /**
     * Pushes an item onto the top of this stack. * null item is allowed.
     * @param item an item to push in the stack
     */
    void push(Item item);
    /**
     * Looks at the object at the top of this stack without
     * removing it from the stack.
     *
     * @throws EmptyStackException if the stack is empty an exception in thrown
     * @return item returns the first item in the stack.
     * */
    Item peek() throws EmptyStackException;
    /**
     * Removes the object at the top of this stack and returns that object as
     * the value of this function.
     *
     * @throws EmptyStackException if the stack is empty an exception in thrown
     * @return item returns the first item in the stack.
     */
    Item pop() throws EmptyStackException;
}
