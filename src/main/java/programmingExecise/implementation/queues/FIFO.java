package programmingExecise.implementation.queues;

import programmingExecise.implementation.DLG;

public class FIFO<T> extends QueueCommonImpl implements FIFOSpecific<T>  {

    DLG<T> fifo = new DLG<>();

    @Override
    public void add(T element) {
        fifo.addElementEnd(element);
    }


}
