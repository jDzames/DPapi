import rx.Observer;

import java.util.List;


public class LiveQuery implements Observer<List<Document>> {

    //private Observable<Cursor> cursor; asi nic


    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onNext(List<Document> documents) {

    }
}
