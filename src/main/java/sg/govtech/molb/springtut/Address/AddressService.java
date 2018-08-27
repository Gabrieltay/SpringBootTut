package sg.govtech.molb.springtut.Address;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService {

    @Autowired
    AddressRepository addressRepository;

    public List<Address> getAll() {
        List<Address> addresses = new ArrayList<Address>();

        addressRepository.findAll().forEach(addresses::add);
        return addresses;
    }

    public Address getAddress(Integer id){

        return addressRepository.findById(id).get();
    }

    public void addAddress(Address Address){
        addressRepository.save(Address);
    }

    public void updateAddress(Address Address){
        addressRepository.save(Address);
    }

    public void deleteAddress(Integer id){
        addressRepository.deleteById(id);
    }
}
