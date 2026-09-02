package сustomStringBuilder;

import java.util.ArrayDeque;
import java.util.Deque;

public class CustomStringBuilder {
    StringBuilder builder = new StringBuilder();
    private final Deque<String> history = new ArrayDeque<>();

    public void saveSnapshot() {
        history.push(builder.toString());
    }

    public CustomStringBuilder append(String text) {
        saveSnapshot();
        builder.append(text);
        return this;

    }

    public CustomStringBuilder deleteLast(int count) {
        if (count < 0 || count > builder.length()) {
            throw new IllegalArgumentException(
                    "Количество символов для удаления некорректно"
            );
        }

        saveSnapshot();
        int start = builder.length() - count;
        builder.delete(start, builder.length());

        return this;
    }
    public void undo() {
        if (history.isEmpty()) {
            throw new IllegalStateException("Нечего отменять");
        }

        builder = new StringBuilder(history.pop());
    }
    @Override
    public String toString() {
        return builder.toString();
    }

}
