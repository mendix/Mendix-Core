package org.company.recordshop.service;

import static org.junit.Assert.assertEquals;

import org.company.recordshop.service.dto.AddressDto;
import org.company.recordshop.service.dto.CustomerWithAddressDto;
import org.company.recordshop.service.dto.SimpleCustomerDto;
import org.company.recordshop.service.local.CustomerServiceModelLocalService;
import org.hibernate.criterion.MatchMode;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.mendix.runtime.queries.SearchParameters;
import org.springframework.beans.factory.annotation.Autowired;

public class FindByExampleServiceTest extends AbstractServiceTestCase {

    @Autowired
    private CustomerServiceModelLocalService custService;

    @Before
    public void setup() {
        SimpleCustomerDto testCustomer = new SimpleCustomerDto();
        testCustomer.setFirstName("John");
        testCustomer.setLastName("Someone");
        testCustomer.setBirthDate(new DateTime());
        testCustomer.setCustomerNr(1);
        Long cust1Id = custService.createCustomer(testCustomer);
        
        testCustomer = new SimpleCustomerDto();
        testCustomer.setFirstName("Johnathan");
        testCustomer.setLastName("Anotherone");
        testCustomer.setBirthDate(new DateTime());
        testCustomer.setCustomerNr(2);
        custService.createCustomer(testCustomer);
        
        testCustomer = new SimpleCustomerDto();
        testCustomer.setFirstName("Johnny");
        testCustomer.setLastName("Noone");
        testCustomer.setBirthDate(new DateTime());
        testCustomer.setCustomerNr(3);
        custService.createCustomer(testCustomer);
        
        AddressDto address = new AddressDto();
        address.setCity("SomeCity");
        address.setHouseNumber("10");
        address.setStreetName("ThisStreet");
        address.setZipcode("12345-1234");
        Long addressId = custService.createAddress(address);
        
        CustomerWithAddressDto custWithAddress = new CustomerWithAddressDto();
        custWithAddress.setFirstName("Susan");
        custWithAddress.setLastName("Thomson");
        custWithAddress.setBirthDate(new DateTime());
        custWithAddress.setCustomerNr(4);
        custWithAddress.setHomeAddress(custService.readAddress(addressId));
        custService.createCustomerWithAddress(custWithAddress);
        
        flush();
        clear();
    }

    @Test
    public void findAndCountByExample() {
        
        SimpleCustomerDto exampleDto = new SimpleCustomerDto();
        assertEquals(4, custService.findByExample(exampleDto).size());
        
        exampleDto.setFirstName("John");
        assertEquals(3, custService.findByExample(exampleDto).size());
        assertEquals(3, custService.countByExample(exampleDto));
        
        exampleDto.setFirstName("Johnny");
        assertEquals(1, custService.findByExample(exampleDto).size());
        assertEquals(1, custService.countByExample(exampleDto));
    }

    @Test
    public void findByExampleWithSearchParameters() {
        
        SearchParameters sparam = new SearchParameters();
        SimpleCustomerDto exampleDto = new SimpleCustomerDto();
        assertEquals(4, custService.findByExample(exampleDto, sparam).size());
        assertEquals(4, custService.countByExample(exampleDto));
        
        sparam.setFirstResult(0);
        sparam.setMaxResults(2);
        sparam.setIgnoreCase(false);
        sparam.setMatchMode(MatchMode.START);
                
        exampleDto.setFirstName("John");
        // findByExample() applies the setFirstResult and setMaxResult values
        assertEquals(2, custService.findByExample(exampleDto, sparam).size());
        // countByExample() will ignore the setFirstResult and setMaxResult values
        assertEquals(3, custService.countByExample(exampleDto, sparam));
    }
    
    @Test
    public void findByExampleWithAssociation() {
        
        CustomerWithAddressDto exampleCustomer = new CustomerWithAddressDto();
        AddressDto exampleAddress = new AddressDto();
        
        exampleAddress.setHouseNumber("10");
        exampleCustomer.setHomeAddress(exampleAddress);
        assertEquals(1, custService.findByExample(exampleCustomer).size());
        assertEquals(1, custService.countByExample(exampleCustomer));
        
        exampleCustomer.setFirstName("DOES-NOT-EXIST");
        assertEquals(0, custService.findByExample(exampleCustomer).size());
    }
}
