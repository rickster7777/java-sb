package com.sept.ecom_proj.controller;

import com.sept.ecom_proj.model.Product;
import com.sept.ecom_proj.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet() {
        return "hello Ecomm!";
    }

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(service.getAllProducts(), HttpStatus.OK);
    }

    //    @GetMapping("/products/{id}")
//    public ResponseEntity<Object> getProductById(@PathVariable int id){
//        return new ResponseEntity<>(service.getProductById(id), HttpStatus.OK);
//        //return service.getProductById(id);
//    }
    @GetMapping("/products/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable int id) {

        Product product = service.getProductById(id);

        if (product == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            return new ResponseEntity<>(product, HttpStatus.OK);
        }
        //return new ResponseEntity<>(service.getProductById(id), HttpStatus.OK);
        //return service.getProductById(id);
    }
//    @GetMapping("/{prodId}")
//    public Product getProductById(@PathVariable int prodId) {
//        return service.getProductById(prodId);
//    }


    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart("product") Product product,
                                        @RequestPart("imageFile") MultipartFile imageFile) {
        try {
            System.out.println("In addProduct");
            System.out.println(product);
            // Call the service to add the product and handle the image file
            Product savedProduct = service.addProduct(product, imageFile);

            // Return the saved product with a 201 Created status
            return new ResponseEntity<>(savedProduct, HttpStatus.CREATED);

        } catch (Exception e) {
            // Log the exception (optional) and return a 400 Bad Request status with the error message
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }


    @DeleteMapping("/product/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable int id) {
        boolean isDeleted = service.deleteProductById(id);

        if (isDeleted) {
            return new ResponseEntity<>("Product deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Product not found", HttpStatus.NOT_FOUND);
        }
    }
}


