package fitness.service;

import fitness.model.Person;
import fitness.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    //CreateOperation
    public Person create(String firstName, String eMail, int age, String password, String number, String plan){

        return personRepository.save(new Person(firstName, eMail, age,password,number,plan));
    }

    public Person create(Person person) {
        return personRepository.save(person);
    }

    //RetrieveOperation
    public List<Person> getAll() {
        return personRepository.findAll();
    }

    public Person findByFirstName(String firstName){
        return personRepository.findByFirstName(firstName);
    }

    //UpdateOperation

    public Person update(String firstName, String eMail, int age, String password, String number, String plan){

        Person p = personRepository.findByFirstName(firstName);
        p.seteMail(eMail);
        p.setAge(age);
        p.setPassword(password);
        p.setNumber(number);
        p.setPlan(plan);
        return personRepository.save(p);
    }

    //DeleteOperation

    public void deleteAll(){
        personRepository.deleteAll();
    }

    public void delete(String firstName){

        Person p = personRepository.findByFirstName(firstName);
        personRepository.delete(p);
    }
}
