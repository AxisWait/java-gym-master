package ru.yandex.practicum.gym;

public class CounterOfTrainings implements Comparable<CounterOfTrainings> {
    private final Coach coach;
    private final int count;

    public CounterOfTrainings(Coach coach, int count) {
        this.coach = coach;
        this.count = count;
    }

    public Coach getCoach() {
        return coach;
    }

    public int getCount() {
        return count;
    }

    @Override
    public int compareTo(CounterOfTrainings o) {
        int result = Integer.compare(o.count, this.count);   // по убыванию
        if (result != 0) return result;
        return this.coach.toString().compareTo(o.coach.toString());
    }

    @Override
    public String toString() {
        return coach + ": " + count;
    }
}
