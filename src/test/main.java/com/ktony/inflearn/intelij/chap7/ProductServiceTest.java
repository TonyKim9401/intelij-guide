package main.java.com.ktony.inflearn.intelij.chap7;

import com.ktony.inflearn.intelij.chap7.Product;
import com.ktony.inflearn.intelij.chap7.ProductRepository;
import com.ktony.inflearn.intelij.chap7.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@SpringBootTest
public class ProductServiceTest {

    ProductRepository productRepository;

    ProductService productService;

/*    @After
    public void tearDown() throws Exception {
        productRepository.deleteAllInBatch();
    }*/

    @Test
    public void dummyTest(){
        System.out.println(1111);
    }

    @Test
    public void basicBebuging() {
        //given & when
        Long id = productService.register(1000L, "책");

        //then
        assertThat(id, is(1L));
    }

    @Test
    public void Evaluate사용하기() {
        //given
        productRepository.save(new Product(1000L, "책"));
        productRepository.save(new Product(2000L, "운동화"));
        productRepository.save(new Product(3000L, "냉장고"));

        //when
        Product product = productService.findByName("운동화");

        //then
        assertThat(product.getAmount(), is(2000L));
    }
}