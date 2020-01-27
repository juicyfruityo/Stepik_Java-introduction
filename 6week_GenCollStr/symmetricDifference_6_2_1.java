public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
    Set<T> my_set1 = new HashSet<>();
    Set<T> my_set2 = new HashSet<>();

    my_set1.addAll(set1);
    my_set2.addAll(set2);

    my_set1.removeAll(set2);
    my_set2.removeAll(set1);

    my_set1.addAll(my_set2);
    return my_set1;
}
