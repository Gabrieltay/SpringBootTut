package sg.govtech.molb.springtut.Address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AddressController {
    
    @Autowired
    AddressService addressService;

    @RequestMapping("/addresses")
    public List<Address> getAll(){
        return addressService.getAll();
    }

    @RequestMapping("/addresses/{id}")
    public Address getAddress(@PathVariable int id){
        return addressService.getAddress(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/addresses")
    public void addAddress(@RequestBody Address address){
        addressService.addAddress(address);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/addresses/{id}")
    public void updateAddress(@PathVariable int id, @RequestBody Address address){
        address.setId(id);
        addressService.updateAddress(address);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/addresses/{id}")
    public void deleteAddress(@PathVariable int id){
        addressService.deleteAddress(id);
    }
}
