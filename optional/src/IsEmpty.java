import java.util.Optional;

public class IsEmpty {
    /**
     * Verifica se o Optional está vazio (não contém um valor não nulo)
     */
    public static void main(String[] args) {

        Optional<String> optionalValue = Optional.ofNullable(null);
        System.out.println(optionalValue.isEmpty());

    }
}
