package AOP_Exercise;

public class RainForecast implements Forecast {
  @Override
  public String weatherTomorrow() {
    System.out.println("내일은 비가 오겠습니다");
    return "rain";
  }
}
