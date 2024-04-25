import java.util.ArrayList;
import java.util.List;

//Subject는 한 개
//옵저버는 여러 개일 수 있으니 일대다 관계이다
public interface Subject {

    void registObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}

