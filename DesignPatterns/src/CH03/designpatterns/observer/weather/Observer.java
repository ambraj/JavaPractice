package CH03.designpatterns.observer.weather;

public interface Observer {
    void update(float temp, float humidity, float pressure);
}
