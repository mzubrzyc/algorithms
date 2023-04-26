package algorithms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@UtilityClass
public class ListMiddleElementFinder {

    public static <E> List<E> findMiddleElementOfListInOnePass(List<E> list) {
        if (list.isEmpty()) {
            log.info("Provided list is empty");
            return Collections.emptyList();
        }

        Iterator<E> currentPosition = list.iterator();
        Iterator<E> middlePosition = list.iterator();
        int currentPositionIterationState = 0;
        E middleValue = null;
        while (currentPosition.hasNext()) {
            currentPosition.next();
            currentPositionIterationState++;
            if (currentPositionIterationState % 2 == 0) {
                middleValue = middlePosition.next();
            }
        }
        return getProperElements(
            middleValue,
            middlePosition,
            currentPositionIterationState
        );
    }

    private static <E> List<E> getProperElements(
        E middleValue,
        Iterator<E> middlePosition,
        int iterationState
    ) {
        List<E> result = new ArrayList<>();
        if (iterationState % 2 != 0) {
            result.add(middlePosition.next());
        } else {
            result.addAll(List.of(
                              Objects.requireNonNull(middleValue),
                              middlePosition.next()
                          )
            );
        }
        return result;
    }

}
