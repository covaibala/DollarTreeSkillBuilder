package com.dollartree.skillbuilder.rabbit;

import java.util.List;

public interface RabbitEstimator {

    List<Integer> estimateRabbitsByMonth(int numberOfMonths);

    void reverse(final List<Integer> rabbitsByMonth);
}
