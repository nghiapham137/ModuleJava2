package com.codegym;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public class CollectionUtilsAdapter implements CollectionOperations{

    @Override
    public int findMax(Set<Integer> numbers) {
        List<Integer> array = new ArrayList<>();
        array.addAll(numbers);
        return Collections.max(numbers);
    }
}
