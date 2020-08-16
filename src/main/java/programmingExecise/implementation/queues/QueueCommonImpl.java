package programmingExecise.implementation.queues;

import programmingExecise.implementation.DLG;

public class QueueCommonImpl<T> implements QueueCommon<T> {

    private DLG<T> dlg = new DLG();

    @Override
    public boolean isEmpty() {
        return dlg.isEmpty();
    }

    @Override
    public int size() {
        return dlg.size();
    }

    @Override
    public T get() {
        return dlg.getElement();
    }

}
