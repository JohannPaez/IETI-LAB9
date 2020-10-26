package eci.ieti;

import eci.ieti.data.CustomerRepository;
import eci.ieti.data.ProductRepository;
import eci.ieti.data.TodoRepository;
import eci.ieti.data.UserRepository;
import eci.ieti.data.model.Customer;
import eci.ieti.data.model.Product;

import eci.ieti.data.model.Todo;
import eci.ieti.data.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.BasicQuery;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class Application implements CommandLineRunner {


    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private TodoRepository todoRepository;

    @Autowired
    private UserRepository userRepository;
    
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        /*
        customerRepository.deleteAll();

        customerRepository.save(new Customer("Alice", "Smith"));
        customerRepository.save(new Customer("Bob", "Marley"));
        customerRepository.save(new Customer("Jimmy", "Page"));
        customerRepository.save(new Customer("Freddy", "Mercury"));
        customerRepository.save(new Customer("Michael", "Jackson"));

        System.out.println("Customers found with findAll():");
        System.out.println("-------------------------------");
        
        customerRepository.findAll().stream().forEach(System.out::println);
        System.out.println();
        
        productRepository.deleteAll();

        productRepository.save(new Product(1L, "Samsung S8", "All new mobile phone Samsung S8"));
        productRepository.save(new Product(2L, "Samsung S8 plus", "All new mobile phone Samsung S8 plus"));
        productRepository.save(new Product(3L, "Samsung S9", "All new mobile phone Samsung S9"));
        productRepository.save(new Product(4L, "Samsung S9 plus", "All new mobile phone Samsung S9 plus"));
        productRepository.save(new Product(5L, "Samsung S10", "All new mobile phone Samsung S10"));
        productRepository.save(new Product(6L, "Samsung S10 plus", "All new mobile phone Samsung S10 plus"));
        productRepository.save(new Product(7L, "Samsung S20", "All new mobile phone Samsung S20"));
        productRepository.save(new Product(8L, "Samsung S20 plus", "All new mobile phone Samsung S20 plus"));
        productRepository.save(new Product(9L, "Samsung S20 ultra", "All new mobile phone Samsung S20 ultra"));
        
        System.out.println("Paginated search of products by criteria:");
        System.out.println("-------------------------------");
        
        productRepository.findByDescriptionContaining("plus", PageRequest.of(0, 2)).stream()
        	.forEach(System.out::println);
   
        System.out.println();
        */
        userRepository.deleteAll();
        todoRepository.deleteAll();
        User user1 = userRepository.save(new User("Juan Gomez","juan@mail.com"));
        User user2 = userRepository.save(new User("Jeisson Gomez","jeisson@mail.com"));
        User user3 = userRepository.save(new User("Johann Gomez","johann@mail.com"));
        User user4 = userRepository.save(new User("Edwin Gomez","edwin@mail.com"));
        User user5 = userRepository.save(new User("Orlando Gomez","orlando@mail.com"));
        User user6 = userRepository.save(new User("Niko Gomez","niko@mail.com"));
        User user7 = userRepository.save(new User("Brayan Gomez","brayan@mail.com"));
        User user8 = userRepository.save(new User("Marcelo Gomez","marcelo@mail.com"));
        User user9 = userRepository.save(new User("Diego Gomez","diego@mail.com"));
        User user10 = userRepository.save(new User("Daniel Gomez","daniel@mail.com"));
        Long number = new Long(999999999);
        Long timeMillis = System.currentTimeMillis();
        Todo todo1 = todoRepository.save(new Todo("Descripcion 1", 3, new Date(timeMillis - number * 1), user1, "Ready"));
        Todo todo2 = todoRepository.save(new Todo("Descripcion 2", 4, new Date(timeMillis + number * 2), user2, "In Progress"));
        Todo todo3 = todoRepository.save(new Todo("Descripcion 3", 5, new Date(timeMillis - number * 3), user1, "Done"));
        Todo todo4 = todoRepository.save(new Todo("Descripcion 4", 6, new Date(timeMillis - number * 4), user4, "Done"));
        Todo todo5 = todoRepository.save(new Todo("Descripcion 5", 7, new Date(timeMillis - number * 1), user1, "Done"));
        Todo todo6 = todoRepository.save(new Todo("Descripcion 6", 1, new Date(timeMillis - number * 2), user6, "Ready"));
        Todo todo7 = todoRepository.save(new Todo("Descripcion 7", 2, new Date(timeMillis + number * 1), user7, "In Progress"));
        Todo todo8 = todoRepository.save(new Todo("Descripcion 8", 3, new Date(timeMillis + number * 2), user8, "Ready"));
        Todo todo9 = todoRepository.save(new Todo("Descripcion 9", 10, new Date(timeMillis - number * 5), user1, "Ready"));
        Todo todo10 = todoRepository.save(new Todo("Descripcion 10", 4, new Date(timeMillis - number * 3), user10, "Done"));

        Todo todo11 = todoRepository.save(new Todo("Descripcion 1", 6, new Date(timeMillis + number * 1), user5, "Ready"));
        Todo todo12 = todoRepository.save(new Todo("Descripcion 2", 1, new Date(timeMillis - number * 2), user2, "In Progress"));
        Todo todo13 = todoRepository.save(new Todo("Descripcion 3", 8, new Date(timeMillis + number * 3), user9, "Done"));
        Todo todo14 = todoRepository.save(new Todo("Descripcion 4", 3, new Date(timeMillis - number * 4), user4, "Done"));
        Todo todo15 = todoRepository.save(new Todo("Descripcion 5", 4, new Date(timeMillis + number * 1), user3, "Done"));
        Todo todo16 = todoRepository.save(new Todo("Descripcion 6", 4, new Date(timeMillis + number * 2), user6, "Ready"));
        Todo todo17 = todoRepository.save(new Todo("Descripcion 7", 1, new Date(timeMillis - number * 1), user2, "In Progress"));
        Todo todo18 = todoRepository.save(new Todo("Descripcion 8", 3, new Date(timeMillis - number * 2), user3, "Ready"));
        Todo todo19 = todoRepository.save(new Todo("Descripcion 9", 5, new Date(timeMillis + number * 5), user6, "Ready"));
        Todo todo20 = todoRepository.save(new Todo("Descripcion 10", 1, new Date(timeMillis + number * 3), user9, "Done"));

        System.out.println("TERMINO !!!");
        System.out.println("TERMINO !!!");
        System.out.println("TERMINO !!!");

        List<Todo> todosUser1 = new ArrayList<>();
        todosUser1.add(todo3);
        todosUser1.add(todo5);
        todosUser1.add(todo9);
        user1.setTodos(todosUser1);
        userRepository.save(user1);
        List<Todo> todosUser2 = new ArrayList<>();
        todosUser2.add(todo2);
        todosUser2.add(todo12);
        todosUser2.add(todo17);
        user2.setTodos(todosUser2);
        userRepository.save(user2);
        List<Todo> todosUser3 = new ArrayList<>();
        todosUser3.add(todo15);
        todosUser3.add(todo18);
        user3.setTodos(todosUser3);
        userRepository.save(user3);

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfiguration.class);
        MongoOperations mongoOperation = (MongoOperations) applicationContext.getBean("mongoTemplate");

        Query query = new Query();
        query.addCriteria(Criteria.where("dueDate").lt(new Date()));

        List<Todo> todosExpired = mongoOperation.find(query, Todo.class);
        System.out.println("\nTodos Totales 20");
        System.out.println("Todos donde la fecha ha expirado: " + todosExpired.size());
        for (Todo todo: todosExpired) {
            System.out.println(todo.toString());
        }

        query = new Query();
        query.addCriteria(Criteria.where("priority").gte(5).andOperator(Criteria.where("responsible").is(user1)));
        List<Todo> priorityGT = mongoOperation.find(query, Todo.class);


        System.out.println("\nTodos Totales 20");
        System.out.println("Todos los que estan asignados a un usuario dado y tienen una prioridad mayor igual que 5: " + priorityGT.size());
        for (Todo todo: priorityGT) {
            System.out.println(todo.toString());
        }

        query = new Query();
        //query.addCriteria(Criteria.where("todos").gt()
        BasicQuery query1 = new BasicQuery("{$nor: [{todos: {$exists: false}}, {todos: {$size: 0}}, {todos: {$size: 1}}, {todos: {$size: 2}}]}");
        List<User> userList = mongoOperation.find(query1, User.class);

        System.out.println("\nUsuarios Totales 10");
        System.out.println("Usuarios que han asignado más de 2 Todos: " + userList.size());
        for (User user: userList) {
            System.out.println(user.toString());
        }
    }

}