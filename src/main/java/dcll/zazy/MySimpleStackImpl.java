package dcll.zazy;

import java.util.EmptyStackException;

/**
 * Created by Abel on 02/03/15.
 */
public class MySimpleStackImpl implements MySimpleStack {

    /**
     * number of elements in stack.
     */
    private int nbElements;
    /**
     * maximum elements allowed.
     */
    private int maxSize;
    /**
     * array of elments used to implement stack.
     */
    private Item[] stack;

    /**
     * @param s size of the stack.
     */
    public MySimpleStackImpl(final int s) {
        maxSize = s;
        nbElements = 0;
        stack = new Item[maxSize];
    }

    @Override
    public final boolean isEmpty() {
        return (nbElements == 0);
    }

    @Override
    public final int getSize() {
        return nbElements;
    }

    @Override
    public final void push(final Item item) {
        if (nbElements < maxSize) {
        stack[nbElements++] = item;
        }
    }

    @Override
    public final Item peek() throws EmptyStackException {
        return stack[nbElements];
    }

    @Override
    public final Item pop() throws EmptyStackException {
        return stack[nbElements--];
    }
}
