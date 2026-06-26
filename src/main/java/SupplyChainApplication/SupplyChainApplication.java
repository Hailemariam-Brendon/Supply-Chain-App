package SupplyChainApplication;

import models.Shoe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import repositories.ShoeRepository;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@SpringBootApplication
public class SupplyChainApplication {
    @Autowired
    static ShoeRepository shoeRepository1;

	public static void main(String[] args) {
        SpringApplication.run(SupplyChainApplication.class, args);

        System.out.println("Start application.");

        System.out.println("Import ShoeRepository1 from Autowired annotation above.");

        System.out.println("Create Shoe1.");
        Shoe shoe1 = new Shoe();
        shoe1.setId(1L);
        shoe1.setColor("Blue");
        shoe1.setName("Sketchers");
        shoe1.setSize(12);
        System.out.println("Finished Creating shoe");

        //TODo Why is the shoeRepository1 value showing as null?
        // Fix the shoeRepository1 coming back as a null value.

        System.out.println("Print out shoeRepository1 value.");
//        System.out.println(shoeRepository1);

        //TODo Get shoe1 to sve to the MySQL database.
        System.out.println("Save shoe 1.");
//        shoeRepository1.save(shoe1);
        System.out.println("Finished saving shoe 1.");

    }
}
