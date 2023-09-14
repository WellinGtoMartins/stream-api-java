import java.util.Optional;

public class OrElse {
    /**
     * Obtém o valor contido no Optional, ou retorna um valor padrão
     * se o Optional estiver vazio
     */
    public static void main(String[] args) {
        Optional<String> optionalValue = Optional.ofNullable(null);
        String result = optionalValue.orElse("Default");
        System.out.println(result);
    }
}
