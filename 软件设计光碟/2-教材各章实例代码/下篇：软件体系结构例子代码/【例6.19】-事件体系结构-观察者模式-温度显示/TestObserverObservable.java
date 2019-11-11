


public class TestObserverObservable {
  public static void main(String[] args) throws Exception {

    //create an observable object
    TemperatureGUI temperatureObj = new TemperatureGUI();

    //Create Observer objects
    CelsiusGUI cg = new CelsiusGUI();
    FahrenheitGUI fg = new FahrenheitGUI();
    KelvinGUI kg = new KelvinGUI();

    //注意：AddObservers是在这里被使用了
    temperatureObj.addObserver(cg);
    temperatureObj.addObserver(fg);
    temperatureObj.addObserver(kg);
  }
}