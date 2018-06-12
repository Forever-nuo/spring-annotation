import config.SpringConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Forever丶诺
 * @date: 2018/6/12 11:34
 */
@Slf4j
public class Main {
    public static void main(String[] args) {
        ApplicationContext annotationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        log.info("获取 注解的Context:" +annotationContext.toString());
    }

}
