package com.creational;

import java.util.Objects;

public final class Pizza {
    private String dough;
    private String sauce;
    private String topping;
    private PIZZA_TYPE type;

    private Pizza(final String dough, final String sauce, final String topping,
                  final PIZZA_TYPE type) {
        this.dough = dough;
        this.sauce = sauce;
        this.topping = topping;
        this.type = type;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final Pizza pizza = (Pizza) o;
        return Objects.equals(dough, pizza.dough) &&
                Objects.equals(sauce, pizza.sauce) &&
                Objects.equals(topping, pizza.topping) &&
                Objects.equals(type, pizza.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dough, sauce, topping, type);
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", topping='" + topping + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    public enum PIZZA_TYPE {VEG, NON_VEG}

    public static class PizzaBuilder {
        private String dough;
        private String sauce;
        private String topping;
        private PIZZA_TYPE type;

        public PizzaBuilder() {
        }

        public String getDough() {
            return dough;
        }

        public PizzaBuilder setDough(final String dough) {
            this.dough = dough;
            return this;
        }


        public PizzaBuilder setSauce(final String sauce) {
            this.sauce = sauce;
            return this;
        }


        public PizzaBuilder setTopping(final String topping) {
            this.topping = topping;
            return this;
        }

        public PizzaBuilder setType(final PIZZA_TYPE type) {
            this.type = type;
            return this;
        }

        public Pizza build() {
            return new Pizza(dough, sauce, topping, type);
        }
    }
}
