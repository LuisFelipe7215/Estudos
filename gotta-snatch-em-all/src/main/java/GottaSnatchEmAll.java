import java.util.HashSet;
import java.util.List;
import java.util.Set;

class GottaSnatchEmAll {

    static Set<String> newCollection(List<String> cards) {
        return new HashSet<>(cards);
    }

    static boolean addCard(String card, Set<String> collection) {
        return collection.add(card);
    }

    static boolean canTrade(Set<String> myCollection, Set<String> theirCollection) {
        return !myCollection.isEmpty() && !theirCollection.isEmpty() && !myCollection.containsAll(theirCollection) && myCollection.size() == theirCollection.size();
    }

    static Set<String> commonCards(List<Set<String>> collections) {
        Set<String> commonsCards = new HashSet<>(collections.getFirst());
        collections.forEach(commonsCards::retainAll);
        return commonsCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        Set<String> allCollections = new HashSet<>();
        collections.forEach(allCollections::addAll);
        return allCollections;
    }
}
