import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.techiekernel.java.config.config.AppConfig;
import org.techiekernel.java.config.service.GoodbyeService;
import org.techiekernel.java.config.service.HelloWorldService;

@SuppressWarnings("resource")
public class App {
	@SuppressWarnings("resource")
	public static void main(String[] args) {

		/**
		 * Create a new ApplicationContext, deriving bean definition from the
		 * given annotated class and automatically refreshing the context.
		 */
		ApplicationContext context = new AnnotationConfigApplicationContext(
				AppConfig.class);
		/**
		 * Return an instance, which may be shared or independent, of the
		 * specified bean.
		 */
		HelloWorldService hello = (HelloWorldService) context
				.getBean("helloWorldBean");
		System.out.println(hello.sayHello("Spring 3.2.3"));

		GoodbyeService bye = (GoodbyeService) context.getBean("goodbyeBean");
		System.out.println(bye.sayGoodbye("Spring 3.2.3"));

	}
}
