package CH07.designpatterns.collections.iterator_builtin;

import java.util.Iterator;

public interface Menu {
    Iterator<String> createIterator();
}
