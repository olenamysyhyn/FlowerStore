package flower.store.filters;

import flower.store.store.Item;

public interface SearchFilter {
   boolean match(Item item);
}
