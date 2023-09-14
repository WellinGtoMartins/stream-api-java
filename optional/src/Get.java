import java.util.Optional;

public class Get {
    /**
     * obtém o valor contido no Optional. Se o valor for nulo,
     * lançará uma exceção NoSuchElementException.
     */
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.of("Hello");
        System.out.println(optionalValue.get());


    }
}
