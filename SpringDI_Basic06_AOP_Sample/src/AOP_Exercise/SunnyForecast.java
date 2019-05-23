package AOP_Exercise;

public class SunnyForecast implements Forecast {
  @Override
  public String weatherTomorrow() {
    System.out.println("내일은 맑은 날씨가 되겠습니다.");
    return "sunny";
  }
}
