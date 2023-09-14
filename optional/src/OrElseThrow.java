import java.util.Optional;

public class OrElseThrow {
    /**
     * Obtém o valor contido no Optional, ou lança uma exceção
     * fornecida por um Supplier se o Optional estiver vazio
     */
    public static void main(String[] args) {

        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElseThrow(() -> new RuntimeException("Value not present"));


    }
}
