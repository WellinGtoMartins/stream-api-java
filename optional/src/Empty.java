import java.util.Optional;

public class Empty {
    /**
     * Retorna um Optional vazio (sem valor)
     */
    public static void main(String[] args) {

        Optional<String> optionalValue = Optional.empty();
        System.out.println(optionalValue.isPresent());
    }
}
