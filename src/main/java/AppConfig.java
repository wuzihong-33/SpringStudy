import com.service.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

import java.time.ZoneId;

@ComponentScan(value = "com")
@Configuration
@EnableAspectJAutoProxy
@PropertySource("app.properties")
public class AppConfig {


}

