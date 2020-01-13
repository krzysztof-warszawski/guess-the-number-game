package kwarszawski;

import lombok.AccessLevel;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Getter
@Component
public class NumberGeneratorImpl implements NumberGenerator {

    // == fields ==
    @Getter(AccessLevel.NONE)
    private final Random random = new Random();

//    @Autowired
//    @MaxNumber
    private final int maxNumber;

//    @Autowired
//    @MinNumber
    private final int minNumber;

    // == constructor ==
    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    // == public methods ==
    @Override
    public int next() {
        return random.nextInt(maxNumber - minNumber) + minNumber;
    }
}
