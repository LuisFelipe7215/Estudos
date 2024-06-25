import java.util.*;
import java.util.stream.Collectors;

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

        for (Set<String> collection : collections) {
            commonsCards.retainAll(collection);
        }

        return commonsCards;
    }

    static Set<String> allCards(List<Set<String>> collections) {
        throw new UnsupportedOperationException("Please implement the (static) GottaSnatchEmAll.allCards() method");
    }
}
