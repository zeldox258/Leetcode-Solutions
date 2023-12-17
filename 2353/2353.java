class FoodRatings {
    private final Map<String, TreeSet<Food>> categories;
    private final Map<String, Food> meals;

    public FoodRatings(final String[] foods, final String[] cuisines, final int[] ratings) {
        this.categories = new HashMap<>();
        this.meals = new HashMap<>();

        for(int i = 0; i < cuisines.length; ++i) {
            final Food food = new Food(cuisines[i], foods[i], ratings[i]);

            this.categories.putIfAbsent(cuisines[i], new TreeSet<>((a, b) -> a.rating() == b.rating() ? b.name().compareTo(a.name()) : a.rating() - b.rating()));
            this.categories.get(cuisines[i]).add(food);
            this.meals.put(foods[i], food);
        }
    }
    
    public void changeRating(final String food, final int newRating) {
        final Food meal = this.meals.get(food);
        final TreeSet<Food> category = categories.get(meal.category());

        category.remove(meal);

        meal.rating(newRating);

        category.add(meal);
    }
    
    public String highestRated(final String cuisine) {
        return this.categories.get(cuisine).last().name();
    }

    private final class Food {
        private final String category;
        private final String name;
        private int rating;

        public Food(final String category, final String name, final int rating) {
            this.category = category;
            this.name = name;
            this.rating = rating;
        }

        public void rating(final int rating) {
            this.rating = rating;
        }

        public int rating() {
            return this.rating;
        }

        public String category() {
            return this.category;
        }

        public String name() {
            return this.name;
        }
    }
}

/**
 * Your FoodRatings object will be instantiated and called as such:
 * FoodRatings obj = new FoodRatings(foods, cuisines, ratings);
 * obj.changeRating(food,newRating);
 * String param_2 = obj.highestRated(cuisine);
 */