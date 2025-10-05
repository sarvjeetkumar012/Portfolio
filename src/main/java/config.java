import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {

    @Value("${web3form.key}")
    private String web3formKey;

    public String getWeb3formKey() {
        return web3formKey;
    }
}
