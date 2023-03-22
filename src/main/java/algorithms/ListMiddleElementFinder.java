package algorithms;

import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@Slf4j
@UtilityClass
public class ListMiddleElementFinder {

    public static <E> List<E> findMiddleElementOfListInOnePass(List<E> linkedList) {
        if (linkedList.isEmpty()) {
            log.info("Provided list is empty");
            return Collections.emptyList();
        }

        Iterator<E> currentPosition = linkedList.iterator();
        Iterator<E> middlePosition = linkedList.iterator();
        int iterationState = 0;
        E middleValue = null;
        while (currentPosition.hasNext()) {
            currentPosition.next();
            iterationState++;
            if (iterationState % 2 == 0) {
                middleValue = middlePosition.next();
            }
        }
        return getProperElements(
                middleValue,
                middlePosition,
                iterationState
        );
    }

    private static <E> List<E> getProperElements(E middleValue, Iterator<E> middlePosition, int iterationState) {
        List<E> result = new ArrayList<>();
        if (iterationState % 2 != 0) {
            result.add(middlePosition.next());
        } else {
            result.addAll(List.of(Objects.requireNonNull(middleValue), middlePosition.next()));
        }
        return result;
    }


}
