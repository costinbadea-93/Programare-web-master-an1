package com.example.demo;

import com.example.demo.model.Product;
import com.example.demo.repository.MainRepository;
import com.example.demo.service.MainService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class MainServiceTest {

    //@Mock, @InjectMocks
    @InjectMocks
    private MainService mainService;

    @Mock
    private MainRepository mainRepository;

    //@BeforeEach
    //@BeforeAll
    //@AfterEach
    //@AfterAll

    @BeforeEach
    public void beforeEach(){
        System.out.println("Hello from before each!!!");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("Hello from before all");
    }

    @AfterEach
    public  void afterEach() {
        System.out.println("Hello from after each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("Hello from after all");
    }

    @Test
    @DisplayName("Retrieve all products")
    public void getAllProductsTest(){
        //arrange
        when(mainRepository.getAllProducts()).thenReturn(
                Arrays.asList(new Product("Ciocolata","Dulciuri", "5 lei"))
        );

        //act
        List<Product> result = mainService.getAllProducts();

        //assert
        Product p = result.get(0);
        assertEquals(result.size(), 1);
        assertEquals(p.getName(), "Ciocolata");
    }

    @Test
    @DisplayName("Adding a new product to my repo")
    public void addProductTest() {
        //arrange
        Product product = new Product("Pufuleti","Dulciuri", "2 lei");
        when(mainRepository.addProduct(product)).thenReturn(product);

        //act
        Product result = mainService.addProduct(product);

        //assert
        assertEquals(product.getName(), result.getName());
        assertEquals(product.getPrice(), result.getPrice());
        assertEquals(product.getCategory(), result.getCategory());

        verify(mainRepository, times(1)).addProduct(product);
    }

    @Test
    @DisplayName("Retrieving a product by category from repo")
    public void getProductByCategoryTest(){
        //arrange
        String category = "Dulciuri";
        when(mainRepository.getAllProducts()).thenReturn(
                Arrays.asList(
                        new Product("Ciocolata","Dulciuri", "5 lei"),
                        new Product("Branza","Lactate", "5 lei"),
                        new Product("Bere","Bauturi", "5 lei"),
                        new Product("Pufuleti","Dulciuri", "5 lei")
                )
        );

        //act
        List<Product> result = mainService.getProductByCategory(category);

        //assert
        assertEquals(result.size(), 2);
    }

    @Test
    @DisplayName("Add product by category for a fail scenario")
    public void addProductWithErrorTest() {
        //arrange
        Product product = new Product("Branza","Lactate", "2 lei");

        //act
        RuntimeException result = assertThrows(RuntimeException.class, () -> mainService.addProductByCategory(product));

        //assert
        assertEquals("Product is not allowed for the given category", result.getMessage());

    }
}
