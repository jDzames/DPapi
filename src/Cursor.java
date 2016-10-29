import rx.Observable;

import java.util.List;

//cursor alias LiveQuery
public class Cursor {

    private List<Document> docs;
    private Observable<List<Document>> obsDocs;

    //private CursorNizsejUrovne cursor;


    public Cursor() {
        obsDocs = Observable.just(docs);
        LiveQuery lq = new LiveQuery();
        obsDocs.subscribe(lq);
    }

    public Cursor(LiveQuery lq) {
        obsDocs = Observable.just(docs);
        obsDocs.subscribe(lq);
    }

    public void forEach(){
        //funkcia zadana?
    }

    public List<Document> fetch(){
        return null;
    }

    public List<Document> map(){
        //funkcia zadana
        return null;
    }


}
