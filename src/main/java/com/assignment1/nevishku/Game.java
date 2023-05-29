package com.assignment1.nevishku;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Game {
    private List<Prize> boxes;

    public Game() {
        initializeBoxes();
    }

    private void initializeBoxes() {
        Prize[] prizes = {
                new Prize("Candy"),
                new Prize("iPhone"),
                new Prize("$100"),
                new Prize("Vacation"),
                new Prize("Car")
        };

        boxes = new ArrayList<>(Arrays.asList(prizes));
        Collections.shuffle(boxes);
    }

    public List<Prize> getBoxes() {
        return boxes;
    }

    public Prize openBox(int index) {
        return boxes.get(index);
    }
}
