package com.metr.api.repositories;

import com.metr.api.configuration.CustomDateDeserializer;
import com.metr.api.models.Customer;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


@Repository
public class CustomerRespositoryImpl implements CustomerRepository {

    private static final String COLLIST = "c.first_name, c.last_name, c.address_1, c.address_2, c.city, c.state, c.zip, " +
            "c.phone_number, c.email, c.date_created, c.last_login, c.last_updated, c.customer_id, c.renter, c.rentee";


    private static final String FIND_CUSTOMER_BY_ID = "SELECT "+ COLLIST + " FROM metr.CUSTOMER c WHERE c.customer_id = ?";

    private static final String FIND_ALL_CUSTOMERS = "SELECT * FROM metr.CUSTOMER";

    private final JdbcTemplate jdbcTemplate;

    public CustomerRespositoryImpl(@Autowired JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Customer getCustomerById(Long id) {

        List<Customer> customers = jdbcTemplate.query(FIND_CUSTOMER_BY_ID, new Object[]{id}, ((resultSet, i) -> createCustomer(resultSet, i)));

        return customers.get(0);

    }


    @Override
    public List<Customer> getAllCustomers() {

        return jdbcTemplate.query(FIND_ALL_CUSTOMERS, new RowMapper<Customer>() {
            @Override
            public Customer mapRow(ResultSet resultSet, int i) throws SQLException {
                return createCustomer(resultSet, i);
            }
        });
    }

    @Override
    public void updateCustomer(Customer customer) {

    }

    @Override
    public void createCustomer(Customer customer) {

    }

    @Override
    public void deactivateCustomer(Long customerId) {

    }

    private Customer createCustomer(ResultSet rs, int rowNum) throws SQLException{
        Customer customer = new Customer();
        customer.setFirstName(rs.getString("first_name"));
        customer.setLastName(rs.getString("last_name"));
        customer.setAddress1(rs.getString("address_1"));
        customer.setAddress2(rs.getString("address_2"));
        customer.setCity(rs.getString("city"));
        customer.setState(rs.getString("state"));
        customer.setZip(rs.getString("zip"));
        customer.setPhoneNumber(rs.getString("phone_number"));
        customer.setEmail(rs.getString("email"));
        customer.setDateCreated(new DateTime(rs.getDate("date_created")));
        customer.setLastLogin(new DateTime(rs.getDate("last_login")));
        customer.setLastUpdated(new DateTime(rs.getDate("last_updated")));
        customer.setCustomerId(rs.getLong("customer_id"));
        customer.setRenter(rs.getBoolean("renter"));
        customer.setRentee(rs.getBoolean("rentee"));

        return customer;

    }

    /**
     private Customer getCustomer(){
     DateTime currentTime = new DateTime();

     Customer customer = new Customer();
     customer.setFirstName("Bob");
     customer.setLastName("Doe");
     customer.setAddress1("123 Main St");
     customer.setAddress2("Apt 28");
     customer.setCity("Charlotte");
     customer.setState("NC");
     customer.setZip("28206");
     customer.setRenter(true);
     customer.setRentee(false);
     customer.setDateCreated(currentTime.minus(10));
     customer.setLastLogin(currentTime);

     return customer;
     }*/
}
