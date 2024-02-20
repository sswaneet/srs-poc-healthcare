package com.srs.healthcare.healthpoc.controller;

import com.srs.healthcare.healthpoc.model.Publisher;
import com.srs.healthcare.healthpoc.repository.PublisherRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/publisher")
public class PublisherController {

    @Autowired
    private PublisherRepo publisherRepository;

    @PostMapping("/create")
    public Publisher create(@RequestBody Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @GetMapping("/all")
    public List<Publisher> getAllAuthors() {
        return publisherRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Publisher> findOneById(@PathVariable String id) {
        return publisherRepository.findById(id);
    }

    @PutMapping("/update")
    public Publisher update(@RequestBody Publisher publisher){
        return publisherRepository.save(publisher);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable String id){
        publisherRepository.deleteById(id);
    }
}
