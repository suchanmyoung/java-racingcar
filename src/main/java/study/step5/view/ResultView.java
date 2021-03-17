package study.step5.view;

import study.step5.domain.Car;
import study.step5.domain.Cars;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ResultView {

    private static final String RESULT_MESSAGE = "실행 결과";
    private static final String FINAL_WINNERS = "가 최종 우승했습니다.";
    private static final String NAME_SPACE = " : ";
    private static final String NEW_LINE = System.lineSeparator();
    private static final String CAR_LOCATION_EXPRESSION = "-";
    private static final String CAR_LOCATION_JOINNER = "";
    private static final String RACE_WINNER_JOINNER = ",";

    private ResultView() {
    }

    public static void printResultMessage() {
        System.out.println(NEW_LINE + RESULT_MESSAGE);
    }

    public static void printRace(Cars cars) {
        System.out.println(
                cars.stream()
                        .map(car ->
                                car.getCarName() + NAME_SPACE + carLocationToString(car.getLocation())
                        )
                        .collect(Collectors.joining(NEW_LINE))
                        + NEW_LINE
        );
    }

    private static String carLocationToString(int location) {
        return Arrays.stream(new int[location])
                .mapToObj(i -> CAR_LOCATION_EXPRESSION)
                .collect(Collectors.joining(CAR_LOCATION_JOINNER));
    }

    public static void printRaceWinner(List<Car> cars) {
        String winners = cars.stream().map(car -> car.getCarName())
                .collect(Collectors.joining(RACE_WINNER_JOINNER));

        System.out.println(winners + FINAL_WINNERS);
    }
}
