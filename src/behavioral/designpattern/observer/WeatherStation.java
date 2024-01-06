package behavioral.designpattern.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

	private int pressure;
	private int temperature;
	private int humidity;
	private List<Observer> observerList;
	
	public WeatherStation() {
		this.observerList = new ArrayList<>();
	}
	
	@Override
	public void addObserver(Observer o) {
		this.observerList.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		this.observerList.remove(o);
	}

	@Override
	public void notifyAllObservers() {
		for(Observer o: this.observerList) {
			o.update(pressure, temperature, humidity);
		}
	}

	public List<Observer> getObserverList() {
		this.notifyAllObservers();
		
		return observerList;
	}

	public void setPressure(int pressure) {
		this.pressure = pressure;
		
		this.notifyAllObservers();
	}

	public void setTemperature(int temperature) {		
		this.temperature = temperature;
		
		this.notifyAllObservers();
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
		
		this.notifyAllObservers();
	}
	
	
	
	

}
