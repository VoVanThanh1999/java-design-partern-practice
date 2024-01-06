package behavioral.designpattern.observer;

public class App {
	
	public static void main(String[] args) {
		WeatherStation station = new WeatherStation();
		
		WeatherObserver observer1 = new WeatherObserver( station);
		WeatherObserver observer2 = new WeatherObserver( station);
		WeatherObserver observer3 = new WeatherObserver( station);
		WeatherObserver observer4 = new WeatherObserver( station);
		
	
		//station.addObserver(observer1);
		station.setPressure(1);
		
	 
	}
	
}
